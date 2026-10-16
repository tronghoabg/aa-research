package com.waze.map.main;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import com.waze.map.cd;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af implements cd {

    /* renamed from: a, reason: collision with root package name */
    private final ch f29312a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f29313b;

    public af(ch chVar) {
        h.g.b.x.f(chVar, "mobileGeometry");
        this.f29312a = chVar;
        this.f29313b = new u(chVar, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect e(aa aaVar) {
        return RectHelper_androidKt.toComposeRect(com.waze.z.a.e.b.i(aaVar));
    }

    @Override // com.waze.map.cd
    public final kotlinx.coroutines.b.k a() {
        return this.f29313b;
    }

    public final ch b(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        ch chVar = this.f29312a;
        ad adVar = new ad(chVar, this);
        int i2 = bz.f51630a;
        return kotlinx.coroutines.b.ai.V(adVar, afVar, by.b(), e((aa) chVar.d()));
    }

    public final ch c() {
        return this.f29312a;
    }
}
