package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import h.a.i;
import h.g.b.x;
import h.n.l;
import h.n.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExtraSupportedSurfaceCombinationsContainer {
    private final List<SurfaceCombinationOverride> overrideCombinations;
    private final ExtraSupportedSurfaceCombinationsQuirk quirk;
    private static final Companion Companion = new Companion(null);
    private static final l COMBINATION_REGEX = new l("^(([a-zA-Z0-9]+)=)?([a-zA-Z0-9_]+:[a-zA-Z0-9_]+)(,\\s*[a-zA-Z0-9_]+:[a-zA-Z0-9_]+)*$");

    /* compiled from: WazeSource */
    final class SurfaceCombinationOverride {
        private final String cameraId;
        private final SurfaceCombination combination;

        public SurfaceCombinationOverride(String str, SurfaceCombination surfaceCombination) {
            x.f(surfaceCombination, "combination");
            this.cameraId = str;
            this.combination = surfaceCombination;
        }

        public static /* synthetic */ SurfaceCombinationOverride copy$default(SurfaceCombinationOverride surfaceCombinationOverride, String str, SurfaceCombination surfaceCombination, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surfaceCombinationOverride.cameraId;
            }
            if ((i2 & 2) != 0) {
                surfaceCombination = surfaceCombinationOverride.combination;
            }
            return surfaceCombinationOverride.copy(str, surfaceCombination);
        }

        public final String component1() {
            return this.cameraId;
        }

        public final SurfaceCombination component2() {
            return this.combination;
        }

        public final SurfaceCombinationOverride copy(String str, SurfaceCombination surfaceCombination) {
            x.f(surfaceCombination, "combination");
            return new SurfaceCombinationOverride(str, surfaceCombination);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurfaceCombinationOverride)) {
                return false;
            }
            SurfaceCombinationOverride surfaceCombinationOverride = (SurfaceCombinationOverride) obj;
            return x.n(this.cameraId, surfaceCombinationOverride.cameraId) && x.n(this.combination, surfaceCombinationOverride.combination);
        }

        public final String getCameraId() {
            return this.cameraId;
        }

        public final SurfaceCombination getCombination() {
            return this.combination;
        }

        public int hashCode() {
            String str = this.cameraId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.combination.hashCode();
        }

        public String toString() {
            return "SurfaceCombinationOverride(cameraId=" + this.cameraId + ", combination=" + this.combination + ")";
        }
    }

    public ExtraSupportedSurfaceCombinationsContainer(String str) {
        this.quirk = (ExtraSupportedSurfaceCombinationsQuirk) DeviceQuirks.INSTANCE.get(ExtraSupportedSurfaceCombinationsQuirk.class);
        this.overrideCombinations = parseCombinations(str);
    }

    private final List<SurfaceCombinationOverride> parseCombinations(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return i.h();
        }
        List listAf = o.af(str2, new String[]{"|"}, 0, 6);
        ArrayList arrayList = new ArrayList(i.q(listAf, 10));
        Iterator it = listAf.iterator();
        while (it.hasNext()) {
            arrayList.add(o.v((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            SurfaceCombinationOverride singleCombination = parseSingleCombination((String) it2.next());
            if (singleCombination != null) {
                arrayList3.add(singleCombination);
            }
        }
        return arrayList3;
    }

    private final SurfaceCombinationOverride parseSingleCombination(String str) {
        String string;
        String string2;
        String strConcat;
        String str2 = str;
        if (COMBINATION_REGEX.g(str2)) {
            if (o.F(str2, "=", false)) {
                List listAf = o.af(str2, new String[]{"="}, 2, 2);
                string2 = o.v((String) listAf.get(0)).toString();
                string = o.v((String) listAf.get(1)).toString();
            } else {
                string = str;
                string2 = null;
            }
            List listAf2 = o.af(string, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(i.q(listAf2, 10));
            Iterator it = listAf2.iterator();
            while (it.hasNext()) {
                arrayList.add(o.v((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(i.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    SurfaceConfig surfaceConfig = parseSurfaceConfig((String) it2.next(), str);
                    if (surfaceConfig == null) {
                        break;
                    }
                    arrayList4.add(surfaceConfig);
                } else {
                    ArrayList arrayList5 = arrayList4;
                    if (!arrayList5.isEmpty()) {
                        SurfaceCombination surfaceCombination = new SurfaceCombination();
                        Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            surfaceCombination.addSurfaceConfig((SurfaceConfig) it3.next());
                        }
                        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                        if (Logger.isInfoEnabled(Log.TAG)) {
                            String str3 = Camera2Logger.TRUNCATED_TAG;
                            if (string2 != null) {
                                Objects.toString(string2);
                                strConcat = " for camera ".concat(string2);
                            } else {
                                strConcat = "";
                            }
                            android.util.Log.i(str3, "Parsed extra surface combination '" + ((Object) string) + "'" + strConcat);
                        }
                        return new SurfaceCombinationOverride(string2, surfaceCombination);
                    }
                }
            }
        } else {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isErrorEnabled(Log.TAG)) {
                android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Invalid surface combination format: '" + str + "'");
            }
        }
        return null;
    }

    private final SurfaceConfig parseSurfaceConfig(String str, String str2) {
        List listAf = o.af(str, new String[]{":"}, 0, 6);
        if (listAf.size() != 2) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isErrorEnabled(Log.TAG)) {
                android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Invalid surface config format '" + str + "' in '" + str2 + "'.");
            }
            return null;
        }
        try {
            String string = o.v((String) listAf.get(0)).toString();
            Locale locale = Locale.US;
            x.e(locale, "US");
            String upperCase = string.toUpperCase(locale);
            x.e(upperCase, "toUpperCase(...)");
            SurfaceConfig.ConfigType configTypeValueOf = SurfaceConfig.ConfigType.valueOf(upperCase);
            String string2 = o.v((String) listAf.get(1)).toString();
            Locale locale2 = Locale.US;
            x.e(locale2, "US");
            String upperCase2 = string2.toUpperCase(locale2);
            x.e(upperCase2, "toUpperCase(...)");
            return SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, configTypeValueOf, SurfaceConfig.ConfigSize.valueOf(upperCase2), null, 4, null);
        } catch (Exception e2) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            Exception exc = e2;
            if (!Logger.isErrorEnabled(Log.TAG)) {
                return null;
            }
            android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Failed to parse config '" + str + "' in '" + str2 + "'. Valid types: " + SurfaceConfig.ConfigType.getEntries() + ", Valid sizes: " + SurfaceConfig.ConfigSize.getEntries(), exc);
            return null;
        }
    }

    public final List<SurfaceCombination> get(String str) {
        List<SurfaceCombination> extraSupportedSurfaceCombinations;
        x.f(str, "cameraId");
        ArrayList arrayList = new ArrayList();
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.quirk;
        if (extraSupportedSurfaceCombinationsQuirk != null && (extraSupportedSurfaceCombinations = extraSupportedSurfaceCombinationsQuirk.getExtraSupportedSurfaceCombinations(str)) != null) {
            arrayList.addAll(extraSupportedSurfaceCombinations);
        }
        List<SurfaceCombinationOverride> list = this.overrideCombinations;
        ArrayList<SurfaceCombinationOverride> arrayList2 = new ArrayList();
        for (Object obj : list) {
            SurfaceCombinationOverride surfaceCombinationOverride = (SurfaceCombinationOverride) obj;
            if (surfaceCombinationOverride.getCameraId() == null || x.n(surfaceCombinationOverride.getCameraId(), str)) {
                arrayList2.add(obj);
            }
        }
        for (SurfaceCombinationOverride surfaceCombinationOverride2 : arrayList2) {
            arrayList.add(surfaceCombinationOverride2.getCombination());
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Added extra surface combination for camera " + str + ": " + surfaceCombinationOverride2.getCombination());
            }
        }
        return arrayList;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtraSupportedSurfaceCombinationsContainer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ExtraSupportedSurfaceCombinationsContainer(String str, int i2, h.g.b.o oVar) {
        this(1 == (i2 & 1) ? null : str);
    }
}
