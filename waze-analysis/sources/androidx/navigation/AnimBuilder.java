package androidx.navigation;

/* compiled from: WazeSource */
@NavOptionsDsl
/* loaded from: classes3.dex */
public final class AnimBuilder {
    private int enter = -1;
    private int exit = -1;
    private int popEnter = -1;
    private int popExit = -1;

    public final int getEnter() {
        return this.enter;
    }

    public final int getExit() {
        return this.exit;
    }

    public final int getPopEnter() {
        return this.popEnter;
    }

    public final int getPopExit() {
        return this.popExit;
    }

    public final void setEnter(int i2) {
        this.enter = i2;
    }

    public final void setExit(int i2) {
        this.exit = i2;
    }

    public final void setPopEnter(int i2) {
        this.popEnter = i2;
    }

    public final void setPopExit(int i2) {
        this.popExit = i2;
    }
}
