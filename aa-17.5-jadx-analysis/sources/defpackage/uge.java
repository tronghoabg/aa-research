package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class uge extends uvx {
    public boolean a;
    public float b;
    protected final float c;
    public float d;
    protected final ulw e;
    protected float f;
    public float g;
    protected boolean h;

    protected uge(Class cls, float f, ulw ulwVar) {
        super(cls);
        this.a = false;
        this.b = 1.0f;
        this.d = 1.0f;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = 1.0f;
        this.h = false;
        this.c = (float) Math.pow(2.0d, 22.0f - f);
        this.e = ulwVar;
    }

    public final void b(float f, float f2, boolean z) {
        double dFloor = Math.floor(f / 0.25d) * 0.25d;
        if (!this.a) {
            this.b = this.d * this.c * ((float) Math.pow(2.0d, -(dFloor - f2)));
        }
        this.f = f;
        this.h = z;
    }
}
