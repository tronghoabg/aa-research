package com.waze.ev;

import com.waze.jni.protos.ev.EVNetworkData;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class EVNetworksNativeManager extends e {
    public static final int $stable;
    public static final EVNetworksNativeManager INSTANCE = new EVNetworksNativeManager();
    private static final ch<List<g>> networkList;
    private static final bn<List<g>> networksUpdatedState;

    static {
        bn<List<g>> bnVarB = ck.b(null);
        networksUpdatedState = bnVarB;
        networkList = bnVarB;
        $stable = 8;
    }

    private EVNetworksNativeManager() {
    }

    public final ch<List<g>> getNetworkList() {
        return networkList;
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.ev.e
    public void onEVNetworksUpdated(EVNetworkData eVNetworkData) {
        x.f(eVNetworkData, "data");
        bn<List<g>> bnVar = networksUpdatedState;
        List<String> evNetworksList = eVNetworkData.getEvNetworksList();
        x.e(evNetworksList, "getEvNetworksList(...)");
        List<String> list = evNetworksList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (String str : list) {
            x.c(str);
            arrayList.add(new g(str));
        }
        bnVar.c(arrayList);
    }
}
