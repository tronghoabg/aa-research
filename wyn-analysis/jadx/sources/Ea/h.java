package Ea;

import A7.C0237b0;
import E5.C0461l;
import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;

/* loaded from: classes4.dex */
public final class h extends ya.e {

    /* renamed from: a, reason: collision with root package name */
    public final ya.g f3641a;

    public h(ya.g gVar) {
        this.f3641a = gVar;
    }

    @Override // ya.e
    public final Object create(Object obj) {
        Ca.h hVar = (Ca.h) obj;
        zzuc zzucVarZzb = zzun.zzb(hVar.a());
        Context contextB = this.f3641a.b();
        d7.f.f34129b.getClass();
        return new a(zzucVarZzb, (d7.f.a(contextB) >= 204700000 || hVar.c()) ? new C0461l(contextB, hVar, zzucVarZzb) : new C0237b0(contextB, 1), hVar);
    }
}
