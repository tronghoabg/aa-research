package com.moloco.sdk.internal.bidtoken;

import Bf.k;
import Bf.r;
import Ef.E;
import Fe.e;
import android.util.Base64;
import com.moloco.sdk.internal.n;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.internal.z;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import org.json.JSONObject;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f28492a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28492a = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f28492a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        e.U(obj);
        try {
            byte[] bArrDecode = Base64.decode((String) k.I0((String) k.H0(this.f28492a, new char[]{':'}).get(1), new String[]{"."}).get(1), 0);
            AbstractC3340k.d(bArrDecode, "decode(...)");
            return new z(new a(new JSONObject(r.a0(bArrDecode)).getLong("exp")));
        } catch (Exception e7) {
            return new y(new n(e7.toString(), -1));
        }
    }
}
