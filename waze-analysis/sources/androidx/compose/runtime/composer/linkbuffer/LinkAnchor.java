package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Anchor;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LinkAnchor implements Anchor {
    public static final int $stable = 8;
    private int address;

    public LinkAnchor(int i2) {
        this.address = i2;
    }

    public final int getAddress() {
        return this.address;
    }

    @Override // androidx.compose.runtime.Anchor
    public boolean getValid() {
        return this.address != -1;
    }

    public final void setAddress(int i2) {
        this.address = i2;
    }

    public String toString() {
        return super.toString() + "{ address: " + this.address + " }";
    }
}
