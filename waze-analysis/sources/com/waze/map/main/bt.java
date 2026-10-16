package com.waze.map.main;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.map.MapPopupNativeInfo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class bt {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchDetailsPopupInfo$default(bt btVar, int i2, int i3, int i4, h.g.a.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchDetailsPopupInfo");
        }
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        btVar.fetchDetailsPopupInfo(i2, i3, i4, lVar);
    }

    static final byte[] fetchDetailsPopupInfo$lambda$0(bt btVar, int i2, int i3, int i4) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.map.main.MapPopupDataFetcherNativeManager");
        return ((MapPopupDataFetcherNativeManager) btVar).fetchDetailsPopupInfoNTV(i2, i3, i4);
    }

    static final void fetchDetailsPopupInfo$lambda$1(h.g.a.l lVar, byte[] bArr) {
        MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                detailsPopupInfo = (MapPopupNativeInfo.DetailsPopupInfo) MapPopupNativeInfo.DetailsPopupInfo.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(detailsPopupInfo);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchMyLocationPopupInfo$default(bt btVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMyLocationPopupInfo");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        btVar.fetchMyLocationPopupInfo(lVar);
    }

    static final byte[] fetchMyLocationPopupInfo$lambda$0(bt btVar) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.map.main.MapPopupDataFetcherNativeManager");
        return ((MapPopupDataFetcherNativeManager) btVar).fetchMyLocationPopupInfoNTV();
    }

    static final void fetchMyLocationPopupInfo$lambda$1(h.g.a.l lVar, byte[] bArr) {
        MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                detailsPopupInfo = (MapPopupNativeInfo.DetailsPopupInfo) MapPopupNativeInfo.DetailsPopupInfo.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(detailsPopupInfo);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchParkingSuggestionPopupInfo$default(bt btVar, int i2, int i3, int i4, h.g.a.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchParkingSuggestionPopupInfo");
        }
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        btVar.fetchParkingSuggestionPopupInfo(i2, i3, i4, lVar);
    }

    static final byte[] fetchParkingSuggestionPopupInfo$lambda$0(bt btVar, int i2, int i3, int i4) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.map.main.MapPopupDataFetcherNativeManager");
        return ((MapPopupDataFetcherNativeManager) btVar).fetchParkingSuggestionPopupInfoNTV(i2, i3, i4);
    }

    static final void fetchParkingSuggestionPopupInfo$lambda$1(h.g.a.l lVar, byte[] bArr) {
        MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                detailsPopupInfo = (MapPopupNativeInfo.DetailsPopupInfo) MapPopupNativeInfo.DetailsPopupInfo.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(detailsPopupInfo);
            }
        }
    }

    public static /* synthetic */ void fetchParkingSuggestionPopupInfoWithEta$default(bt btVar, int i2, int i3, int i4, int i5, h.g.a.l lVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchParkingSuggestionPopupInfoWithEta");
        }
        if ((i6 & 16) != 0) {
            lVar = null;
        }
        btVar.fetchParkingSuggestionPopupInfoWithEta(i2, i3, i4, i5, lVar);
    }

    static final byte[] fetchParkingSuggestionPopupInfoWithEta$lambda$0(bt btVar, int i2, int i3, int i4, int i5) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.map.main.MapPopupDataFetcherNativeManager");
        return ((MapPopupDataFetcherNativeManager) btVar).fetchParkingSuggestionPopupInfoWithEtaNTV(i2, i3, i4, i5);
    }

    static final void fetchParkingSuggestionPopupInfoWithEta$lambda$1(h.g.a.l lVar, byte[] bArr) {
        MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                detailsPopupInfo = (MapPopupNativeInfo.DetailsPopupInfo) MapPopupNativeInfo.DetailsPopupInfo.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(detailsPopupInfo);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchWazerPopupInfo$default(bt btVar, int i2, int i3, int i4, h.g.a.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchWazerPopupInfo");
        }
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        btVar.fetchWazerPopupInfo(i2, i3, i4, lVar);
    }

    static final byte[] fetchWazerPopupInfo$lambda$0(bt btVar, int i2, int i3, int i4) {
        h.g.b.x.d(btVar, "null cannot be cast to non-null type com.waze.map.main.MapPopupDataFetcherNativeManager");
        return ((MapPopupDataFetcherNativeManager) btVar).fetchWazerPopupInfoNTV(i2, i3, i4);
    }

    static final void fetchWazerPopupInfo$lambda$1(h.g.a.l lVar, byte[] bArr) {
        MapPopupNativeInfo.WazerPopupInfo wazerPopupInfo = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                wazerPopupInfo = (MapPopupNativeInfo.WazerPopupInfo) MapPopupNativeInfo.WazerPopupInfo.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(wazerPopupInfo);
            }
        }
    }

    public void fetchDetailsPopupInfo(int i2, int i3, int i4, h.g.a.l<? super MapPopupNativeInfo.DetailsPopupInfo, h.ab> lVar) {
        NativeManager.runNativeTask(new bs(this, i2, i3, i4, 2), new bq(lVar, 4));
    }

    public void fetchMyLocationPopupInfo(h.g.a.l<? super MapPopupNativeInfo.DetailsPopupInfo, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.map.main.bp
            @Override // com.waze.hw
            public final Object a() {
                return bt.fetchMyLocationPopupInfo$lambda$0(this.f29404a);
            }
        }, new bq(lVar, 0));
    }

    public void fetchParkingSuggestionPopupInfo(int i2, int i3, int i4, h.g.a.l<? super MapPopupNativeInfo.DetailsPopupInfo, h.ab> lVar) {
        NativeManager.runNativeTask(new bs(this, i2, i3, i4, 1), new bq(lVar, 1));
    }

    public void fetchParkingSuggestionPopupInfoWithEta(final int i2, final int i3, final int i4, final int i5, h.g.a.l<? super MapPopupNativeInfo.DetailsPopupInfo, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.map.main.br
            @Override // com.waze.hw
            public final Object a() {
                return bt.fetchParkingSuggestionPopupInfoWithEta$lambda$0(this.f29407a, i2, i3, i4, i5);
            }
        }, new bq(lVar, 2));
    }

    public void fetchWazerPopupInfo(int i2, int i3, int i4, h.g.a.l<? super MapPopupNativeInfo.WazerPopupInfo, h.ab> lVar) {
        NativeManager.runNativeTask(new bs(this, i2, i3, i4, 0), new bq(lVar, 3));
    }

    public final void fetchMyLocationPopupInfo() {
        fetchMyLocationPopupInfo$default(this, null, 1, null);
    }

    public final void fetchDetailsPopupInfo(int i2, int i3, int i4) {
        fetchDetailsPopupInfo$default(this, i2, i3, i4, null, 8, null);
    }

    public final void fetchParkingSuggestionPopupInfo(int i2, int i3, int i4) {
        fetchParkingSuggestionPopupInfo$default(this, i2, i3, i4, null, 8, null);
    }

    public final void fetchParkingSuggestionPopupInfoWithEta(int i2, int i3, int i4, int i5) {
        fetchParkingSuggestionPopupInfoWithEta$default(this, i2, i3, i4, i5, null, 16, null);
    }

    public final void fetchWazerPopupInfo(int i2, int i3, int i4) {
        fetchWazerPopupInfo$default(this, i2, i3, i4, null, 8, null);
    }
}
