package com.waze.navigate;

import com.waze.main.navigate.EventOnRoute;
import com.waze.main.navigate.LocationData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bn implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f31124a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31125b;

    public /* synthetic */ bn(h.g.a.l lVar, int i2) {
        this.f31125b = i2;
        this.f31124a = lVar;
    }

    @Override // com.waze.jni.a
    public final void a(Object obj) {
        switch (this.f31125b) {
            case 0:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 1:
                this.f31124a.invoke((Boolean) obj);
                break;
            case 2:
                this.f31124a.invoke((EventOnRoute[]) obj);
                break;
            case 3:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 4:
                this.f31124a.invoke((String[]) obj);
                break;
            case 5:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 6:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 7:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 8:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 9:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 10:
                this.f31124a.invoke((LocationData) obj);
                break;
            case 11:
                this.f31124a.invoke((AddressItem[]) obj);
                break;
            case 12:
                this.f31124a.invoke((String) obj);
                break;
            case 13:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 14:
                this.f31124a.invoke((Product) obj);
                break;
            case 15:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 16:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 17:
                this.f31124a.invoke((EventOnRoute[]) obj);
                break;
            case 18:
                this.f31124a.invoke((h.ab) obj);
                break;
            case 19:
                this.f31124a.invoke((h.ab) obj);
                break;
            default:
                this.f31124a.invoke((Boolean) obj);
                break;
        }
    }
}
