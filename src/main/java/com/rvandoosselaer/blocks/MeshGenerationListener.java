package com.rvandoosselaer.blocks;

/**
 * A listener that is notified by the {@link BlocksManager} when the mesh of a chunk is generated.
 * This can be used to notify applications that a new version of a chunk mesh is available.
 *
 * @author remy
 */
public interface MeshGenerationListener {

    void generationFinished(Chunk chunk);

}
