package coremem;

import coremem.interfaces.MappableMemory;

public abstract class MappedMemoryBase extends MemoryBase	implements
																													MappableMemory

{

	private volatile boolean mIsMapped;

	@Override
	public abstract long map();

	@Override
	public abstract void unmap();

	@Override
	public boolean isCurrentlyMapped()
	{
		return mIsMapped;
	}

	protected void setCurrentlyMapped(boolean pMapped)
	{
		mIsMapped = pMapped;
	}
}