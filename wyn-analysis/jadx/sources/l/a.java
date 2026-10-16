package l;

import android.graphics.drawable.Animatable;
import u3.C4242d;

/* loaded from: classes.dex */
public final class a extends Ba.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39781j;
    public final Animatable k;

    public /* synthetic */ a(Animatable animatable, int i5) {
        this.f39781j = i5;
        this.k = animatable;
    }

    @Override // Ba.c
    public final void P() {
        switch (this.f39781j) {
            case 0:
                this.k.start();
                break;
            default:
                ((C4242d) this.k).start();
                break;
        }
    }

    @Override // Ba.c
    public final void Q() {
        switch (this.f39781j) {
            case 0:
                this.k.stop();
                break;
            default:
                ((C4242d) this.k).stop();
                break;
        }
    }
}
