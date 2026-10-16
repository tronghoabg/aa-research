package com.waze.app_nav.hub.c;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.unit.IntSize;
import com.waze.asks.at;
import com.waze.asks.au;
import com.waze.favorites.v;
import com.waze.jni.protos.favorites.Favorites;
import com.waze.jni.protos.favorites.IsHomeWorkSetResult;
import com.waze.jni.protos.inbox.InboxMessageList;
import com.waze.navigate.AddressItem;
import com.waze.z.a.g.z;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15303a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15304b;

    public /* synthetic */ h(Object obj, int i2) {
        this.f15304b = i2;
        this.f15303a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.waze.ab.a.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.waze.ab.a.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.waze.ab.a.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.waze.ab.a.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [com.waze.ab.a.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [com.waze.jni.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.waze.jni.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.waze.jni.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30, types: [com.waze.jni.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f15304b) {
            case 0:
                return Boolean.valueOf(x.n(((k) obj).b(), this.f15303a));
            case 1:
                return com.waze.z.a.d.e.k(this.f15303a, (com.waze.z.a.d.q) obj);
            case 2:
                FocusState focusState = (FocusState) obj;
                x.f(focusState, "it");
                this.f15303a.invoke(new com.waze.z.a.d.i(focusState.isFocused()));
                return ab.f48028a;
            case 3:
                x.f((KeyboardActionScope) obj, "$this$KeyboardActions");
                this.f15303a.invoke(com.waze.z.a.d.m.f45967a);
                return ab.f48028a;
            case 4:
                String str = (String) obj;
                x.f(str, "it");
                this.f15303a.invoke(new com.waze.z.a.d.n(str));
                return ab.f48028a;
            case 5:
                int i2 = z.f46124a;
                this.f15303a.setValue((IntSize) obj);
                return ab.f48028a;
            case 6:
                this.f15303a.d(((Boolean) obj).booleanValue());
                return ab.f48028a;
            case 7:
                this.f15303a.h(((Boolean) obj).booleanValue());
                return ab.f48028a;
            case 8:
                this.f15303a.g((Uri) obj);
                return ab.f48028a;
            case 9:
                ActivityResult activityResult = (ActivityResult) obj;
                x.f(activityResult, "result");
                int resultCode = activityResult.getResultCode();
                ?? r4 = this.f15303a;
                if (resultCode == -1) {
                    Intent data = activityResult.getData();
                    r4.f(data != null ? data.getData() : null);
                } else {
                    r4.f(null);
                }
                return ab.f48028a;
            case 10:
                ModalBottomSheetValue modalBottomSheetValue = (ModalBottomSheetValue) obj;
                x.f(modalBottomSheetValue, "newValue");
                if (modalBottomSheetValue == ModalBottomSheetValue.Hidden) {
                    this.f15303a.c();
                }
                return true;
            case 11:
                this.f15303a.a((IsHomeWorkSetResult) obj);
                return ab.f48028a;
            case 12:
                this.f15303a.a((Favorites) obj);
                return ab.f48028a;
            case 13:
                this.f15303a.a((AddressItem) obj);
                return ab.f48028a;
            case 14:
                this.f15303a.a((AddressItem) obj);
                return ab.f48028a;
            case 15:
                return v.b((v) this.f15303a, (Boolean) obj);
            case 16:
                String str2 = (String) obj;
                String str3 = str2;
                ?? r42 = this.f15303a;
                if (str3 == null || str3.length() == 0) {
                    r42.a(com.waze.af.a.f14047a);
                } else {
                    r42.a(new com.waze.af.b(str2));
                }
                return ab.f48028a;
            case 17:
                this.f15303a.a((String) obj);
                return ab.f48028a;
            case 18:
                return com.waze.inbox.k.b((com.waze.inbox.k) this.f15303a, (InboxMessageList) obj);
            case 19:
                String str4 = (String) obj;
                at atVar = (at) this.f15303a;
                if ((atVar.b() instanceof com.waze.asks.o) && x.n(((com.waze.asks.o) atVar.b()).b(), str4)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                com.waze.location.q qVar = (com.waze.location.q) obj;
                return Boolean.valueOf(((qVar instanceof com.waze.an.a.s) && x.n(((com.waze.an.a.s) qVar).b().b(), ((au) this.f15303a).e())) ? false : true);
        }
    }
}
