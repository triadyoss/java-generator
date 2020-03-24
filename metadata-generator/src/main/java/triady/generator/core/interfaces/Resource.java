package triady.generator.core.interfaces;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.nio.file.Path;
import java.nio.file.Paths;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Resource {
  private final String path;

  private final Id id;

  protected Path getPath(){
    return Paths.get(this.path, this.id.toString());
  }
}