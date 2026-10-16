package Yc;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import uc.InterfaceC4285v;

/* loaded from: classes5.dex */
public final class g implements InterfaceC4285v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16767a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16768b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16769c;

    @Override // uc.InterfaceC4285v
    public final boolean onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        A5.h hVar;
        switch (this.f16767a) {
            case 0:
                int i10 = 0;
                if (!this.f16768b || i5 != 240 || (hVar = (A5.h) this.f16769c) == null) {
                    return false;
                }
                this.f16768b = false;
                if (iArr.length > 0 && iArr[0] == 0) {
                    i10 = 1;
                }
                Integer numValueOf = Integer.valueOf(i10);
                HashMap map = (HashMap) hVar.f361b;
                map.put("authorizationStatus", numValueOf);
                ((TaskCompletionSource) hVar.f362c).setResult(map);
                return true;
            default:
                if (this.f16768b || i5 != 9796) {
                    return false;
                }
                this.f16768b = true;
                int length = iArr.length;
                aa.f fVar = (aa.f) this.f16769c;
                if (length == 0 || iArr[0] != 0) {
                    fVar.d("CameraAccessDenied", "Camera access permission was denied.");
                } else if (iArr.length <= 1 || iArr[1] == 0) {
                    fVar.d(null, null);
                } else {
                    fVar.d("AudioAccessDenied", "Audio access permission was denied.");
                }
                return true;
        }
    }

    public g(aa.f fVar) {
        this.f16767a = 1;
        this.f16768b = false;
        this.f16769c = fVar;
    }
}
