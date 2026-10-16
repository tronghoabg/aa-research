package com.waze;

import android.content.Intent;
import com.waze.gas.GasNativeManager;
import com.waze.jni.protos.LoadAutoCompleteVenueResponse;
import com.waze.jni.protos.MessageBoxIconProto;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ft implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23949c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f23950d;

    ft(NativeManager nativeManager, int[] iArr, int[] iArr2, int i2) {
        this.f23950d = i2;
        this.f23949c = iArr;
        this.f23948b = iArr2;
        Objects.requireNonNull(nativeManager);
        this.f23947a = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23950d;
        if (i2 == 0) {
            Object obj = this.f23949c;
            gb.ShowTechCodePopupJNI$lambda$0((gb) this.f23947a, (String) this.f23948b, (String) obj);
            return;
        }
        if (i2 == 1) {
            Object obj2 = this.f23947a;
            NativeManager nativeManager = (NativeManager) obj2;
            nativeManager.AddPopupNTV((int[]) this.f23949c, (int[]) this.f23948b);
            return;
        }
        if (i2 == 2) {
            if (lm.d().e() != null) {
                Intent intent = new Intent(lm.d().e(), (Class<?>) SimpleListMenuActivity.class);
                intent.putExtra(GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE, (String) this.f23947a);
                intent.putExtra("actions", (String[]) this.f23948b);
                intent.putExtra("labels", (String[]) this.f23949c);
                lm.d().e().startActivity(intent);
                return;
            }
            return;
        }
        if (i2 == 3) {
            Object obj3 = this.f23949c;
            iu.reloadPlatformStringsJNI$lambda$0((iu) this.f23947a, (String) this.f23948b, (String) obj3);
        } else if (i2 == 4) {
            iu.onAutocompleteVenueLoadedJNI$lambda$0((iu) this.f23947a, (LoadAutoCompleteVenueResponse) this.f23948b, this.f23949c);
        } else if (i2 != 5) {
            Object obj4 = this.f23949c;
            jd.onCalendarUpdateProtobufJNI$lambda$0((jd) this.f23947a, this.f23948b, (String) obj4);
        } else {
            Object obj5 = this.f23948b;
            iu.openProgressIconPopupJNI$lambda$0((iu) this.f23947a, (String) this.f23949c, (MessageBoxIconProto) obj5);
        }
    }

    public /* synthetic */ ft(Object obj, Object obj2, Object obj3, int i2) {
        this.f23950d = i2;
        this.f23947a = obj;
        this.f23948b = obj2;
        this.f23949c = obj3;
    }

    public /* synthetic */ ft(iu iuVar, String str, MessageBoxIconProto messageBoxIconProto, int i2) {
        this.f23950d = i2;
        this.f23947a = iuVar;
        this.f23949c = str;
        this.f23948b = messageBoxIconProto;
    }

    ft(NativeManager nativeManager, String str, String[] strArr, String[] strArr2, int i2) {
        this.f23950d = i2;
        this.f23947a = str;
        this.f23948b = strArr;
        this.f23949c = strArr2;
        Objects.requireNonNull(nativeManager);
    }
}
