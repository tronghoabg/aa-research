package androidx.camera.video.internal.config;

import androidx.camera.video.MediaConstants;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FormatComboRegistry {
    private final Map<Integer, Map<String, Set<FormatCombo>>> formatComboMapping;

    /* compiled from: WazeSource */
    public final class Builder {
        private final Map<Integer, Map<String, Set<FormatCombo>>> formatComboMapping = new LinkedHashMap();

        /* compiled from: WazeSource */
        public final class ContainerScope {
            private final int container;
            private final Map<String, Set<FormatCombo>> videoMap;

            public ContainerScope(int i2, Map<String, Set<FormatCombo>> map) {
                x.f(map, "videoMap");
                this.container = i2;
                this.videoMap = map;
            }

            public final void support(List<String> list, List<String> list2) {
                x.f(list, "videoMimes");
                x.f(list2, "audioMimes");
                for (String str : list) {
                    Map<String, Set<FormatCombo>> map = this.videoMap;
                    LinkedHashSet linkedHashSet = map.get(str);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        map.put(str, linkedHashSet);
                    }
                    Set<FormatCombo> set = linkedHashSet;
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        set.add(new FormatCombo(this.container, str, (String) it.next()));
                    }
                    set.add(new FormatCombo(this.container, str, null));
                }
                Map<String, Set<FormatCombo>> map2 = this.videoMap;
                LinkedHashSet linkedHashSet2 = map2.get(null);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet();
                    map2.put(null, linkedHashSet2);
                }
                Set<FormatCombo> set2 = linkedHashSet2;
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    set2.add(new FormatCombo(this.container, null, (String) it2.next()));
                }
            }
        }

        public final FormatComboRegistry build() {
            return new FormatComboRegistry(this.formatComboMapping, null);
        }

        public final void container(int i2, l<? super ContainerScope, ab> lVar) {
            x.f(lVar, "block");
            Map<Integer, Map<String, Set<FormatCombo>>> map = this.formatComboMapping;
            Integer numValueOf = Integer.valueOf(i2);
            LinkedHashMap linkedHashMap = map.get(numValueOf);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                map.put(numValueOf, linkedHashMap);
            }
            lVar.invoke(new ContainerScope(i2, linkedHashMap));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FormatComboRegistry(Map<Integer, ? extends Map<String, ? extends Set<FormatCombo>>> map) {
        this.formatComboMapping = map;
    }

    public final List<FormatCombo> getCombos(int i2, String str, String str2) {
        x.f(str, "videoMime");
        x.f(str2, "audioMime");
        ArrayList arrayList = new ArrayList();
        Iterator it = (i2 == -1 ? this.formatComboMapping.keySet() : i.d(Integer.valueOf(i2))).iterator();
        while (it.hasNext()) {
            Map<String, Set<FormatCombo>> map = this.formatComboMapping.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (map != null) {
                Iterator it2 = (x.n(str, MediaConstants.MIME_TYPE_UNSPECIFIED) ? map.keySet() : i.d(str)).iterator();
                while (it2.hasNext()) {
                    Set<FormatCombo> set = map.get((String) it2.next());
                    if (set != null) {
                        if (x.n(str2, MediaConstants.MIME_TYPE_UNSPECIFIED)) {
                            arrayList.addAll(set);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : set) {
                                if (x.n(((FormatCombo) obj).getAudioMime(), str2)) {
                                    arrayList2.add(obj);
                                }
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<FormatCombo> getCombosForAudio(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, Set<FormatCombo>>> it = this.formatComboMapping.values().iterator();
        while (it.hasNext()) {
            for (Set<FormatCombo> set : it.next().values()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : set) {
                    if (x.n(((FormatCombo) obj).getAudioMime(), str)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public final List<FormatCombo> getCombosForVideo(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, Set<FormatCombo>>> it = this.formatComboMapping.values().iterator();
        while (it.hasNext()) {
            Set<FormatCombo> set = it.next().get(str);
            if (set != null) {
                arrayList.addAll(set);
            }
        }
        return arrayList;
    }

    public /* synthetic */ FormatComboRegistry(Map map, o oVar) {
        this(map);
    }
}
