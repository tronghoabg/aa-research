package com.waze.maplabelsposition;

import com.google.v.eu;
import com.waze.jni.protos.ConversionExtensionsKt;
import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.GenerateMapObjectsPositionRequest;
import com.waze.jni.protos.map.GenerateMapObjectsPositionRequestKt;
import com.waze.jni.protos.map.GenerateMapObjectsPositionResult;
import com.waze.jni.protos.map.Marker;
import com.waze.jni.protos.map.Polyline;
import com.waze.jni.protos.map.PolylineKt;
import com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignment;
import com.waze.map.b.dp;
import com.waze.map.b.dq;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f29609a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f29610b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f29611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, List list, List list2, e eVar) {
        super(2, eVar);
        this.f29609a = dVar;
        this.f29610b = list;
        this.f29611c = list2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new c(this.f29609a, this.f29610b, this.f29611c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = this.f29610b;
        MapLabelsPositionsNativeManager mapLabelsPositionsNativeManager = this.f29609a.f29612a;
        x.f(list, "polylines");
        List list2 = this.f29611c;
        x.f(list2, "coordinatesToBeFarFrom");
        GenerateMapObjectsPositionRequestKt.Dsl dsl_create = GenerateMapObjectsPositionRequestKt.Dsl.Companion._create(GenerateMapObjectsPositionRequest.newBuilder());
        com.google.v.b.a coordinatesToBeFarFrom = dsl_create.getCoordinatesToBeFarFrom();
        List list3 = list2;
        ArrayList arrayList = new ArrayList(i.q(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(ConversionExtensionsKt.toIntPosition((com.waze.shared_infra.h.c) it.next()));
        }
        dsl_create.addAllCoordinatesToBeFarFrom(coordinatesToBeFarFrom, arrayList);
        com.google.v.b.a polylines = dsl_create.getPolylines();
        List<dp> list4 = list;
        ArrayList arrayList2 = new ArrayList(i.q(list4, 10));
        for (dp dpVar : list4) {
            PolylineKt.Dsl dsl_create2 = PolylineKt.Dsl.Companion._create(Polyline.newBuilder());
            com.google.v.b.a position = dsl_create2.getPosition();
            List listB = dpVar.b();
            ArrayList arrayList3 = new ArrayList(i.q(listB, 10));
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                arrayList3.add(ConversionExtensionsKt.toIntPosition((com.waze.shared_infra.h.c) it2.next()));
            }
            dsl_create2.addAllPosition(position, arrayList3);
            dsl_create2.setId((int) dpVar.a());
            arrayList2.add(dsl_create2._build());
        }
        dsl_create.addAllPolylines(polylines, arrayList2);
        GenerateMapObjectsPositionRequest generateMapObjectsPositionRequest_build = dsl_create._build();
        x.f(generateMapObjectsPositionRequest_build, "request");
        byte[] byteArray = generateMapObjectsPositionRequest_build.toByteArray();
        x.e(byteArray, "toByteArray(...)");
        byte[] bArrNativeGenerateEtaLabelPositionsNTV = mapLabelsPositionsNativeManager.nativeGenerateEtaLabelPositionsNTV(byteArray);
        GenerateMapObjectsPositionResult generateMapObjectsPositionResult = null;
        if (bArrNativeGenerateEtaLabelPositionsNTV != null) {
            try {
                generateMapObjectsPositionResult = (GenerateMapObjectsPositionResult) GenerateMapObjectsPositionResult.parser().c(bArrNativeGenerateEtaLabelPositionsNTV);
            } catch (eu unused) {
            }
        }
        if (generateMapObjectsPositionResult == null) {
            return r.j();
        }
        Map<Long, RouteEtaLabelPositionAndAlignment> resultMap = generateMapObjectsPositionResult.getResultMap();
        x.e(resultMap, "getResultMap(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(resultMap.size()));
        Iterator<T> it3 = resultMap.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(Long.valueOf(((Number) entry.getKey()).longValue()), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Position.IntPosition position2 = ((RouteEtaLabelPositionAndAlignment) entry2.getValue()).getPosition();
            x.e(position2, "getPosition(...)");
            Marker.Alignment alignment = ((RouteEtaLabelPositionAndAlignment) entry2.getValue()).getAlignment();
            x.e(alignment, "getAlignment(...)");
            Marker.Alignment alignment2 = Marker.Alignment.ALIGNMENT_UNKNOWN;
            int iOrdinal = alignment.ordinal();
            linkedHashMap2.put(key, new dq(position2, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? EtaLabelDefinitions.PinAlignment.TOP_LEFT : EtaLabelDefinitions.PinAlignment.TOP_RIGHT : EtaLabelDefinitions.PinAlignment.BOTTOM_RIGHT : EtaLabelDefinitions.PinAlignment.BOTTOM_LEFT : EtaLabelDefinitions.PinAlignment.TOP_LEFT));
        }
        return linkedHashMap2;
    }
}
