package Yc;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f16787a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16788b;

    /* renamed from: c, reason: collision with root package name */
    public int f16789c;

    public o(ComponentName componentName) {
        this.f16787a = componentName;
    }

    public abstract void a(Intent intent);

    public final void b(int i5) {
        if (!this.f16788b) {
            this.f16788b = true;
            this.f16789c = i5;
        } else {
            if (this.f16789c == i5) {
                return;
            }
            StringBuilder sbL = pd.f.l(i5, "Given job ID ", " is different than previous ");
            sbL.append(this.f16789c);
            throw new IllegalArgumentException(sbL.toString());
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
