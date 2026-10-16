package com.waze.ui.z;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.webkit.internal.AssetHelper;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f43929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f43930b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f43931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(ManagedActivityResultLauncher managedActivityResultLauncher, h.g.a.a aVar, String str, h.c.e eVar) {
        super(2, eVar);
        this.f43929a = managedActivityResultLauncher;
        this.f43930b = aVar;
        this.f43931c = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ar(this.f43929a, this.f43930b, this.f43931c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", this.f43931c);
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        h.g.b.x.c(intentCreateChooser);
        this.f43929a.launch(intentCreateChooser);
        this.f43930b.invoke();
        return h.ab.f48028a;
    }
}
