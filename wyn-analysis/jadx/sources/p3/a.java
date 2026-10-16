package P3;

import Q3.f;
import S3.p;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9091f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i5) {
        super(fVar);
        this.f9091f = i5;
    }

    @Override // P3.b
    public final boolean a(p workSpec) {
        switch (this.f9091f) {
            case 0:
                AbstractC3340k.e(workSpec, "workSpec");
                return workSpec.f10986j.f5556b;
            case 1:
                AbstractC3340k.e(workSpec, "workSpec");
                return workSpec.f10986j.f5558d;
            case 2:
                AbstractC3340k.e(workSpec, "workSpec");
                return workSpec.f10986j.f5555a == 2;
            case 3:
                AbstractC3340k.e(workSpec, "workSpec");
                int i5 = workSpec.f10986j.f5555a;
                return i5 == 3 || (Build.VERSION.SDK_INT >= 30 && i5 == 6);
            default:
                AbstractC3340k.e(workSpec, "workSpec");
                return workSpec.f10986j.f5559e;
        }
    }

    @Override // P3.b
    public final boolean b(Object obj) {
        switch (this.f9091f) {
            case 2:
                O3.a value = (O3.a) obj;
                AbstractC3340k.e(value, "value");
                int i5 = Build.VERSION.SDK_INT;
                boolean z2 = value.f8852a;
                if (i5 < 26 ? z2 : z2 && value.f8853b) {
                }
            case 3:
                O3.a value2 = (O3.a) obj;
                AbstractC3340k.e(value2, "value");
                if (!value2.f8852a || value2.f8854c) {
                }
                break;
        }
        return !((Boolean) obj).booleanValue();
    }
}
