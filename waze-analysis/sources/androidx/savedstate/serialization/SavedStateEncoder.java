package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import h.a.i;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.b.a.ab;
import kotlinx.b.a.q;
import kotlinx.b.a.y;
import kotlinx.b.b.b;
import kotlinx.b.b.d;
import kotlinx.b.e.e;
import kotlinx.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateEncoder extends b {
    private final SavedStateConfiguration configuration;
    private String key;
    private final Bundle savedState;

    public SavedStateEncoder(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        x.f(bundle, "savedState");
        x.f(savedStateConfiguration, "configuration");
        this.savedState = bundle;
        this.configuration = savedStateConfiguration;
        this.key = "";
    }

    private final void putClassDiscriminatorIfRequired(SavedStateConfiguration savedStateConfiguration, q qVar, Bundle bundle) {
        if (savedStateConfiguration.getClassDiscriminatorMode() != 1) {
            return;
        }
        SavedStateReader.m13269constructorimpl(bundle);
        if (SavedStateReader.m13270containsimpl(bundle, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
            return;
        }
        if (x.n(qVar.h(), y.f50940a) || x.n(qVar.h(), ab.f50903a)) {
            SavedStateWriter.m13355constructorimpl(bundle);
            SavedStateWriter.m13388putStringimpl(bundle, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, qVar.d());
        }
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public d beginStructure(q qVar) {
        k[] kVarArr;
        x.f(qVar, "descriptor");
        if (x.n(this.key, "")) {
            putClassDiscriminatorIfRequired(this.configuration, qVar, this.savedState);
            return this;
        }
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13382putSavedStateimpl(bundle, this.key, bundleBundleOf);
        putClassDiscriminatorIfRequired(this.configuration, qVar, bundleBundleOf);
        return new SavedStateEncoder(bundleBundleOf, this.configuration);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeBoolean(boolean z) {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13361putBooleanimpl(bundle, this.key, z);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeByte(byte b2) {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13372putIntimpl(bundle, this.key, b2);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeChar(char c2) {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13363putCharimpl(bundle, this.key, c2);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeDouble(double d2) {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13368putDoubleimpl(bundle, this.key, d2);
    }

    @Override // kotlinx.b.b.b
    public boolean encodeElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        this.key = qVar.c(i2);
        if (this.configuration.getClassDiscriminatorMode() == 1) {
            Bundle bundle = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle);
            boolean zM13270containsimpl = SavedStateReader.m13270containsimpl(bundle, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            boolean zN = x.n(this.key, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (zM13270containsimpl && zN) {
                Bundle bundle2 = this.savedState;
                SavedStateReader.m13269constructorimpl(bundle2);
                throw new IllegalArgumentException("SavedStateEncoder for " + SavedStateReader.m13340getStringimpl(bundle2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY) + " has property '" + this.key + "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.");
            }
        }
        return true;
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeEnum(q qVar, int i2) {
        x.f(qVar, "enumDescriptor");
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13372putIntimpl(bundle, this.key, i2);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeFloat(float f2) {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13370putFloatimpl(bundle, this.key, f2);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeInt(int i2) {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13372putIntimpl(bundle, this.key, i2);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeLong(long j2) {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13376putLongimpl(bundle, this.key, j2);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeNull() {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13378putNullimpl(bundle, this.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public <T> void encodeSerializableValue(l<? super T> lVar, T t) {
        x.f(lVar, "serializer");
        if (SavedStateEncoder_androidKt.encodeFormatSpecificTypesOnPlatform(this, lVar, t)) {
            return;
        }
        q descriptor = lVar.getDescriptor();
        if (x.n(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            Bundle bundle = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle);
            String str = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            SavedStateWriter.m13374putIntListimpl(bundle, str, (List) t);
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            Bundle bundle2 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle2);
            String str2 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            SavedStateWriter.m13390putStringListimpl(bundle2, str2, (List) t);
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getBooleanListDescriptor())) {
            Bundle bundle3 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle3);
            String str3 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Boolean>");
            SavedStateWriter.m13362putBooleanArrayimpl(bundle3, str3, i.aC((List) t));
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getLongListDescriptor())) {
            Bundle bundle4 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle4);
            String str4 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Long>");
            SavedStateWriter.m13377putLongArrayimpl(bundle4, str4, i.aB((List) t));
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getFloatListDescriptor())) {
            Bundle bundle5 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle5);
            String str5 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            SavedStateWriter.m13371putFloatArrayimpl(bundle5, str5, i.az((List) t));
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getDoubleListDescriptor())) {
            Bundle bundle6 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle6);
            String str6 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
            SavedStateWriter.m13369putDoubleArrayimpl(bundle6, str6, i.ay((List) t));
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getCharListDescriptor())) {
            Bundle bundle7 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle7);
            String str7 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Char>");
            List list = (List) t;
            x.f(list, "<this>");
            char[] cArr = new char[list.size()];
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                cArr[i2] = ((Character) it.next()).charValue();
                i2++;
            }
            SavedStateWriter.m13364putCharArrayimpl(bundle7, str7, cArr);
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            Bundle bundle8 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle8);
            String str8 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.BooleanArray");
            SavedStateWriter.m13362putBooleanArrayimpl(bundle8, str8, (boolean[]) t);
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            Bundle bundle9 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle9);
            String str9 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.CharArray");
            SavedStateWriter.m13364putCharArrayimpl(bundle9, str9, (char[]) t);
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            Bundle bundle10 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle10);
            String str10 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.DoubleArray");
            SavedStateWriter.m13369putDoubleArrayimpl(bundle10, str10, (double[]) t);
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            Bundle bundle11 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle11);
            String str11 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.FloatArray");
            SavedStateWriter.m13371putFloatArrayimpl(bundle11, str11, (float[]) t);
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            Bundle bundle12 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle12);
            String str12 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.IntArray");
            SavedStateWriter.m13373putIntArrayimpl(bundle12, str12, (int[]) t);
            return;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            Bundle bundle13 = this.savedState;
            SavedStateWriter.m13355constructorimpl(bundle13);
            String str13 = this.key;
            x.d(t, "null cannot be cast to non-null type kotlin.LongArray");
            SavedStateWriter.m13377putLongArrayimpl(bundle13, str13, (long[]) t);
            return;
        }
        if (!x.n(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            super.encodeSerializableValue(lVar, t);
            return;
        }
        Bundle bundle14 = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle14);
        String str14 = this.key;
        x.d(t, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        SavedStateWriter.m13389putStringArrayimpl(bundle14, str14, (String[]) t);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeShort(short s) {
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13372putIntimpl(bundle, this.key, s);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeString(String str) {
        x.f(str, "value");
        Bundle bundle = this.savedState;
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13388putStringimpl(bundle, this.key, str);
    }

    public final String getKey$savedstate() {
        return this.key;
    }

    public final Bundle getSavedState$savedstate() {
        return this.savedState;
    }

    @Override // kotlinx.b.b.f
    public e getSerializersModule() {
        return this.configuration.getSerializersModule();
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.d
    public boolean shouldEncodeElementDefault(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return this.configuration.getEncodeDefaults();
    }
}
