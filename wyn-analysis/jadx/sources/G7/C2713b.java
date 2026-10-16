package g7;

import N7.e;
import a2.C1323c;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C1735y;
import com.google.android.gms.common.internal.InterfaceC1736z;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import d7.d;

/* renamed from: g7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2713b extends l implements InterfaceC1736z {

    /* renamed from: a, reason: collision with root package name */
    public static final i f35775a = new i("ClientTelemetry.API", new C7.l(9), new h());

    public final Task c(C1735y c1735y) {
        e eVarA = A.a();
        eVarA.f8591e = new d[]{zaf.zaa};
        eVarA.f8588b = false;
        eVarA.f8590d = new C1323c(c1735y, 11);
        return doBestEffortWrite(eVarA.e());
    }
}
