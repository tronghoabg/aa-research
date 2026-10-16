package com.waze.share;

import android.content.Intent;
import com.waze.NativeManager;
import com.waze.ht;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o implements ht {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f37720a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37721b;

    o(v vVar, int i2, byte[] bArr) {
        this.f37721b = i2;
        Objects.requireNonNull(vVar);
        this.f37720a = vVar;
    }

    @Override // com.waze.ht
    public final /* synthetic */ void a(Object obj) {
        if (this.f37721b != 0) {
            Intent intent = (Intent) obj;
            v vVar = this.f37720a;
            vVar.f37740e = intent;
            vVar.f37741f = vVar.f37737b.getPackageManager();
            NativeManager.Post(new q(vVar, vVar.f37741f.queryIntentActivities(intent, 0)));
            return;
        }
        v vVar2 = this.f37720a;
        vVar2.f37740e = (Intent) obj;
        vVar2.f37740e.addFlags(268435456);
        vVar2.f37740e.setClassName(vVar2.f37742g.activityInfo.packageName, vVar2.f37742g.activityInfo.name);
        vVar2.f37737b.startActivity(vVar2.f37740e);
        vVar2.dismiss();
    }

    o(v vVar, int i2) {
        this.f37721b = i2;
        Objects.requireNonNull(vVar);
        this.f37720a = vVar;
    }
}
