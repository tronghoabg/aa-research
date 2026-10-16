package com.waze.navigate;

import android.view.View;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.iu;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.places.PlacesNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements com.waze.ab.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31342b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31343c;

    public /* synthetic */ f(Object obj, Object obj2, int i2) {
        this.f31343c = i2;
        this.f31341a = obj;
        this.f31342b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v17, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.l, java.lang.Object] */
    @Override // com.waze.ab.q
    public final void onClick(boolean z) {
        switch (this.f31343c) {
            case 0:
                h.E((AddressItem) this.f31342b, z);
                break;
            case 1:
                SideMenuAutoCompleteRecycler.aM((SideMenuAutoCompleteRecycler) this.f31342b, (AddressItem) this.f31341a, z);
                break;
            case 2:
                if (z) {
                    ?? r4 = this.f31341a;
                    AddressItem addressItem = (AddressItem) this.f31342b;
                    PlacesNativeManager.INSTANCE.eraseAddressItem(addressItem.getId(), addressItem.getCategory().intValue(), addressItem.getTitle(), r4);
                    break;
                }
                break;
            case 3:
                com.waze.sdk.bd.s((com.waze.sdk.bd) this.f31341a, (com.waze.sdk.an) this.f31342b, z);
                break;
            case 4:
                com.waze.sdk.bi.h((com.waze.sdk.bi) this.f31342b, this.f31341a, z);
                break;
            case 5:
                if (z) {
                    Object obj = this.f31342b;
                    ?? r3 = this.f31341a;
                    NativeManager nativeManager = NativeManager.getInstance();
                    h.g.b.x.e(nativeManager, "getInstance(...)");
                    iu.resetEvents$default(nativeManager, null, 1, null);
                    NativeManager.getInstance().OpenProgressPopup(r3.c(R.string.CALENDAR_SETTINGS_CLEAR_DONE, new Object[0]));
                    ((View) obj).postDelayed(new ay(4), 1000L);
                    break;
                }
                break;
            case 6:
                if (!z) {
                    this.f31341a.run();
                    break;
                } else {
                    this.f31342b.run();
                    break;
                }
            default:
                if (!z) {
                    this.f31341a.invoke();
                    break;
                } else {
                    this.f31342b.invoke();
                    break;
                }
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f31343c = i2;
        this.f31342b = obj;
        this.f31341a = obj2;
    }
}
