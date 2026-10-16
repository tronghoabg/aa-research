package com.waze;

import android.content.Intent;
import android.os.Handler;
import android.widget.ScrollView;
import androidx.media3.common.C;
import androidx.webkit.internal.AssetHelper;
import com.waze.jni.protos.DeeplinkUpdate;
import com.waze.jni.protos.EtaLabelRequest;
import com.waze.jni.protos.GetCurrencyStringRequest;
import com.waze.jni.protos.NotificationMessage;
import com.waze.jni.protos.QuestionProto;
import com.waze.jni.protos.VenueCategoryGroups;
import com.waze.navigate.NavResultData;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class bl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16893b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f16894c;

    bl(NativeManager nativeManager, String str, String str2, int i2) {
        this.f16894c = i2;
        this.f16893b = str;
        this.f16892a = str2;
        Objects.requireNonNull(nativeManager);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.waze.jni.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.Observer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.waze.hw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.waze.hv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.waze.jni.a, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16894c) {
            case 0:
                bm.onDeeplinkUpdateJNI$lambda$0((bm) this.f16892a, (DeeplinkUpdate) this.f16893b);
                break;
            case 1:
                this.f16892a.onChanged(((com.waze.config.f) this.f16893b).b());
                break;
            case 2:
                NativeManager.lambda$ResetDisplay$1((String) this.f16893b, this.f16892a);
                break;
            case 3:
                NativeManager.lambda$runNativeTask$0(this.f16892a, this.f16893b);
                break;
            case 4:
                this.f16892a.a();
                break;
            case 5:
                this.f16892a.a(this.f16893b);
                break;
            case 6:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.SUBJECT", (String) this.f16893b);
                intent.putExtra("android.intent.extra.TEXT", (String) this.f16892a);
                intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                lm.d().e().startActivity(intent);
                break;
            case 7:
                Object obj = this.f16893b;
                NativeManager nativeManager = (NativeManager) this.f16892a;
                NavResultData navResultData = (NavResultData) obj;
                navResultData.showRoutes = nativeManager.mShowRoutesWhenNavigationStarts;
                if (nativeManager.mShowRoutesWhenNavigationStarts && !navResultData.bIsCalculating) {
                    nativeManager.mShowRoutesWhenNavigationStarts = false;
                    break;
                }
                break;
            case 8:
                ((NativeManager) this.f16892a).venueSaveNavNTV(((com.waze.reports.ed) this.f16893b).an());
                break;
            case 9:
                com.waze.sharedui.a.e eVarE = lm.d().e();
                if (eVarE != null) {
                    com.waze.bs.a.e(eVarE, (String) this.f16893b, (String) this.f16892a);
                    break;
                }
                break;
            case 10:
                ((NativeManager) this.f16892a).SetPrivacyConsentApprovedNTV();
                t.l(this.f16893b);
                break;
            case 11:
                iu.showNotificationMessageJNI$lambda$0((iu) this.f16892a, (NotificationMessage) this.f16893b);
                break;
            case 12:
                iu.getETALabelJNI$lambda$0((iu) this.f16892a, (EtaLabelRequest) this.f16893b);
                break;
            case 13:
                iu.onSearchCategoryGroupsChangedJNI$lambda$0((iu) this.f16892a, (VenueCategoryGroups) this.f16893b);
                break;
            case 14:
                iu.openPoiJNI$lambda$0((iu) this.f16892a, (String) this.f16893b);
                break;
            case 15:
                iu.preparePoiJNI$lambda$0((iu) this.f16892a, (String) this.f16893b);
                break;
            case 16:
                iu.getCurrencyStringJNI$lambda$0((iu) this.f16892a, (GetCurrencyStringRequest) this.f16893b);
                break;
            case 17:
                iu.openExternalBrowserJNI$lambda$0((iu) this.f16892a, (String) this.f16893b);
                break;
            case 18:
                iu.ShowEncouragementJNI$lambda$0((iu) this.f16892a, (QuestionProto) this.f16893b);
                break;
            default:
                ScrollView scrollView = (ScrollView) this.f16893b;
                scrollView.scrollBy(0, 1);
                scrollView.scrollBy(0, -1);
                ((Handler) this.f16892a).postDelayed(this, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                break;
        }
    }

    bl(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f16894c = i2;
        this.f16893b = obj;
        this.f16892a = obj2;
    }

    public /* synthetic */ bl(String str, Runnable runnable, int i2) {
        this.f16894c = i2;
        this.f16893b = str;
        this.f16892a = runnable;
    }

    public /* synthetic */ bl(Object obj, Object obj2, int i2) {
        this.f16894c = i2;
        this.f16892a = obj;
        this.f16893b = obj2;
    }

    bl(NativeManager nativeManager, NavResultData navResultData, int i2) {
        this.f16894c = i2;
        this.f16893b = navResultData;
        Objects.requireNonNull(nativeManager);
        this.f16892a = nativeManager;
    }

    bl(NativeManager nativeManager, com.waze.reports.ed edVar, int i2) {
        this.f16894c = i2;
        this.f16893b = edVar;
        Objects.requireNonNull(nativeManager);
        this.f16892a = nativeManager;
    }

    bl(NativeManager nativeManager, Runnable runnable, int i2) {
        this.f16894c = i2;
        this.f16893b = runnable;
        Objects.requireNonNull(nativeManager);
        this.f16892a = nativeManager;
    }
}
