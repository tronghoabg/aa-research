package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.ByteString;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.b.x;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreferencesFileSerializer implements Serializer<Preferences> {
    public static final PreferencesFileSerializer INSTANCE = new PreferencesFileSerializer();
    public static final String fileExtension = "preferences_pb";

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PreferencesFileSerializer() {
    }

    private final void addProtoEntryToPreferences(String str, PreferencesProto.Value value, MutablePreferences mutablePreferences) throws CorruptionException {
        PreferencesProto.Value.ValueCase valueCase = value.getValueCase();
        if (valueCase == null) {
            throw new CorruptionException("Value case is null.", null, 2, null);
        }
        switch (valueCase) {
            case BOOLEAN:
                mutablePreferences.set(PreferencesKeys.booleanKey(str), Boolean.valueOf(value.getBoolean()));
                return;
            case FLOAT:
                mutablePreferences.set(PreferencesKeys.floatKey(str), Float.valueOf(value.getFloat()));
                return;
            case INTEGER:
                mutablePreferences.set(PreferencesKeys.intKey(str), Integer.valueOf(value.getInteger()));
                return;
            case LONG:
                mutablePreferences.set(PreferencesKeys.longKey(str), Long.valueOf(value.getLong()));
                return;
            case STRING:
                mutablePreferences.set(PreferencesKeys.stringKey(str), value.getString());
                return;
            case STRING_SET:
                Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
                List<String> stringsList = value.getStringSet().getStringsList();
                x.e(stringsList, "getStringsList(...)");
                mutablePreferences.set(keyStringSetKey, i.au(stringsList));
                return;
            case DOUBLE:
                mutablePreferences.set(PreferencesKeys.doubleKey(str), Double.valueOf(value.getDouble()));
                return;
            case BYTES:
                mutablePreferences.set(PreferencesKeys.byteArrayKey(str), value.getBytes().toByteArray());
                return;
            case VALUE_NOT_SET:
                throw new CorruptionException("Value not set.", null, 2, null);
            default:
                throw new h.i();
        }
    }

    private final PreferencesProto.Value getValueProto(Object obj) {
        if (obj instanceof Boolean) {
            PreferencesProto.Value.Builder builderNewBuilder = PreferencesProto.Value.newBuilder();
            builderNewBuilder.setBoolean(((Boolean) obj).booleanValue());
            PreferencesProto.Value valueBuild = builderNewBuilder.build();
            x.e(valueBuild, "build(...)");
            return valueBuild;
        }
        if (obj instanceof Float) {
            PreferencesProto.Value.Builder builderNewBuilder2 = PreferencesProto.Value.newBuilder();
            builderNewBuilder2.setFloat(((Number) obj).floatValue());
            PreferencesProto.Value valueBuild2 = builderNewBuilder2.build();
            x.e(valueBuild2, "build(...)");
            return valueBuild2;
        }
        if (obj instanceof Double) {
            PreferencesProto.Value.Builder builderNewBuilder3 = PreferencesProto.Value.newBuilder();
            builderNewBuilder3.setDouble(((Number) obj).doubleValue());
            PreferencesProto.Value valueBuild3 = builderNewBuilder3.build();
            x.e(valueBuild3, "build(...)");
            return valueBuild3;
        }
        if (obj instanceof Integer) {
            PreferencesProto.Value.Builder builderNewBuilder4 = PreferencesProto.Value.newBuilder();
            builderNewBuilder4.setInteger(((Number) obj).intValue());
            PreferencesProto.Value valueBuild4 = builderNewBuilder4.build();
            x.e(valueBuild4, "build(...)");
            return valueBuild4;
        }
        if (obj instanceof Long) {
            PreferencesProto.Value.Builder builderNewBuilder5 = PreferencesProto.Value.newBuilder();
            builderNewBuilder5.setLong(((Number) obj).longValue());
            PreferencesProto.Value valueBuild5 = builderNewBuilder5.build();
            x.e(valueBuild5, "build(...)");
            return valueBuild5;
        }
        if (obj instanceof String) {
            PreferencesProto.Value.Builder builderNewBuilder6 = PreferencesProto.Value.newBuilder();
            builderNewBuilder6.setString((String) obj);
            PreferencesProto.Value valueBuild6 = builderNewBuilder6.build();
            x.e(valueBuild6, "build(...)");
            return valueBuild6;
        }
        if (!(obj instanceof Set)) {
            if (!(obj instanceof byte[])) {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(String.valueOf(obj.getClass().getName())));
            }
            PreferencesProto.Value.Builder builderNewBuilder7 = PreferencesProto.Value.newBuilder();
            builderNewBuilder7.setBytes(ByteString.copyFrom((byte[]) obj));
            PreferencesProto.Value valueBuild7 = builderNewBuilder7.build();
            x.e(valueBuild7, "build(...)");
            return valueBuild7;
        }
        PreferencesProto.Value.Builder builderNewBuilder8 = PreferencesProto.Value.newBuilder();
        PreferencesProto.StringSet.Builder builderNewBuilder9 = PreferencesProto.StringSet.newBuilder();
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        builderNewBuilder9.addAllStrings((Set) obj);
        builderNewBuilder8.setStringSet(builderNewBuilder9);
        PreferencesProto.Value valueBuild8 = builderNewBuilder8.build();
        x.e(valueBuild8, "build(...)");
        return valueBuild8;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, e<? super Preferences> eVar) throws CorruptionException {
        PreferencesProto.PreferenceMap from = PreferencesMapCompat.Companion.readFrom(inputStream);
        MutablePreferences mutablePreferencesCreateMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map<String, PreferencesProto.Value> preferencesMap = from.getPreferencesMap();
        x.e(preferencesMap, "getPreferencesMap(...)");
        for (Map.Entry<String, PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            String key = entry.getKey();
            PreferencesProto.Value value = entry.getValue();
            PreferencesFileSerializer preferencesFileSerializer = INSTANCE;
            x.c(key);
            x.c(value);
            preferencesFileSerializer.addProtoEntryToPreferences(key, value, mutablePreferencesCreateMutable);
        }
        return mutablePreferencesCreateMutable.toPreferences();
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(Preferences preferences, OutputStream outputStream, e<? super ab> eVar) {
        Map<Preferences.Key<?>, Object> mapAsMap = preferences.asMap();
        PreferencesProto.PreferenceMap.Builder builderNewBuilder = PreferencesProto.PreferenceMap.newBuilder();
        for (Map.Entry<Preferences.Key<?>, Object> entry : mapAsMap.entrySet()) {
            builderNewBuilder.putPreferences(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        builderNewBuilder.build().writeTo(outputStream);
        return ab.f48028a;
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(Preferences preferences, OutputStream outputStream, e eVar) {
        return writeTo2(preferences, outputStream, (e<? super ab>) eVar);
    }
}
