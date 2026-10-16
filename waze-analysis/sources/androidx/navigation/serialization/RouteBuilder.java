package androidx.navigation.serialization;

import androidx.autofill.HintConstants;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.d.a;
import h.g.b.x;
import h.i;
import java.util.Iterator;
import java.util.List;
import kotlinx.b.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RouteBuilder<T> {
    private final String path;
    private String pathArgs;
    private String queryArgs;
    private final b<T> serializer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    final class ParamType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ParamType[] $VALUES;
        public static final ParamType PATH = new ParamType("PATH", 0);
        public static final ParamType QUERY = new ParamType("QUERY", 1);

        private static final /* synthetic */ ParamType[] $values() {
            return new ParamType[]{PATH, QUERY};
        }

        static {
            ParamType[] paramTypeArr$values = $values();
            $VALUES = paramTypeArr$values;
            $ENTRIES = h.d.b.a(paramTypeArr$values);
        }

        private ParamType(String str, int i2) {
        }

        public static a<ParamType> getEntries() {
            return $ENTRIES;
        }

        public static ParamType valueOf(String str) {
            return (ParamType) Enum.valueOf(ParamType.class, str);
        }

        public static ParamType[] values() {
            return (ParamType[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[ParamType.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParamType.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RouteBuilder(b<T> bVar) {
        x.f(bVar, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = bVar;
        this.path = bVar.getDescriptor().d();
    }

    private final void addPath(String str) {
        this.pathArgs = this.pathArgs + DomExceptionUtils.SEPARATOR + str;
    }

    private final void addQuery(String str, String str2) {
        int length = this.queryArgs.length();
        String str3 = this.queryArgs;
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(length == 0 ? "?" : "&");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        this.queryArgs = sb.toString();
    }

    private final ParamType computeParamType(int i2, NavType<Object> navType) {
        return ((navType instanceof CollectionNavType) || this.serializer.getDescriptor().i(i2)) ? ParamType.QUERY : ParamType.PATH;
    }

    public final void appendArg(int i2, String str, NavType<Object> navType, List<String> list) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(navType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(list, "value");
        ParamType paramTypeComputeParamType = computeParamType(i2, navType);
        ParamType paramType = ParamType.PATH;
        int iOrdinal = paramTypeComputeParamType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new i();
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                addQuery(str, (String) it.next());
            }
            return;
        }
        if (list.size() == 1) {
            addPath((String) h.a.i.P(list));
            return;
        }
        throw new IllegalArgumentException("Expected one value for argument " + str + ", found " + list.size() + "values instead.");
    }

    public final void appendPattern(int i2, String str, NavType<Object> navType) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(navType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        ParamType paramTypeComputeParamType = computeParamType(i2, navType);
        ParamType paramType = ParamType.PATH;
        int iOrdinal = paramTypeComputeParamType.ordinal();
        if (iOrdinal == 0) {
            addPath("{" + str + "}");
            return;
        }
        if (iOrdinal != 1) {
            throw new i();
        }
        addQuery(str, "{" + str + "}");
    }

    public final String build() {
        return this.path + this.pathArgs + this.queryArgs;
    }

    public RouteBuilder(String str, b<T> bVar) {
        x.f(str, "path");
        x.f(bVar, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = bVar;
        this.path = str;
    }
}
