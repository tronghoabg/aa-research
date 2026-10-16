package com.waze.main_screen.p;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import androidx.sqlite.SQLiteConnection;
import com.waze.network.GrpcCallerNativeManager;
import com.waze.reports.NearbyGasStationsActivity;
import com.waze.search.v2.cu;
import com.waze.settings.he;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27303b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27304c;

    public /* synthetic */ m(int i2, Object obj, int i3) {
        this.f27304c = i3;
        this.f27302a = i2;
        this.f27303b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v25, types: [androidx.compose.runtime.MutableFloatState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v28, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f27304c) {
            case 0:
                return bi.J((com.waze.main_screen.m.p) this.f27303b, this.f27302a, (Rect) obj);
            case 1:
                return com.waze.closure.c.i.b((com.waze.closure.c.i) this.f27303b, this.f27302a, (String) obj);
            case 2:
                return com.waze.main_screen.t.al.G((com.waze.main_screen.m.p) this.f27303b, this.f27302a, (Rect) obj);
            case 3:
                return GrpcCallerNativeManager.DoGRPCCall$lambda$0$1((GrpcCallerNativeManager) this.f27303b, this.f27302a, (byte[]) obj);
            case 4:
                return NearbyGasStationsActivity.l((NearbyGasStationsActivity) this.f27303b, this.f27302a, (String[]) obj);
            case 5:
                return com.waze.search.ai.b(this.f27302a, this.f27303b, (DisposableEffectScope) obj);
            case 6:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                int i2 = this.f27302a;
                int i3 = cu.f36302a;
                h.g.b.x.f(layoutCoordinates, "coor");
                this.f27303b.invoke(Integer.valueOf(i2), layoutCoordinates);
                return h.ab.f48028a;
            case 7:
                he heVar = (he) obj;
                h.g.b.x.f(heVar, "it");
                return he.k(heVar, null, null, null, null, null, null, (String) this.f27303b, this.f27302a, null, 1279);
            case 8:
                return com.waze.stats.storage.g.o((com.waze.stats.aa) this.f27303b, this.f27302a, (SQLiteConnection) obj);
            case 9:
                this.f27303b.setFloatValue(((int) (((IntSize) obj).m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + this.f27302a);
                return h.ab.f48028a;
            default:
                String str = (String) obj;
                h.g.b.x.f(str, "it");
                if (str.length() <= this.f27302a) {
                    String str2 = str;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= str2.length()) {
                            this.f27303b.invoke(str);
                        } else if (Character.isDigit(str2.charAt(i4))) {
                            i4++;
                        }
                    }
                }
                return h.ab.f48028a;
        }
    }

    public /* synthetic */ m(Object obj, int i2, int i3) {
        this.f27304c = i3;
        this.f27303b = obj;
        this.f27302a = i2;
    }
}
