package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import kotlinx.b.a.aa;
import kotlinx.b.a.q;
import kotlinx.b.a.z;
import kotlinx.b.b.a;
import kotlinx.b.b.c;
import kotlinx.b.e.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateDecoder extends a {
    private final SavedStateConfiguration configuration;
    private int index;
    private String key;
    private final Bundle savedState;

    public SavedStateDecoder(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        x.f(bundle, "savedState");
        x.f(savedStateConfiguration, "configuration");
        this.savedState = bundle;
        this.configuration = savedStateConfiguration;
        this.key = "";
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public c beginStructure(q qVar) {
        x.f(qVar, "descriptor");
        if (x.n(this.key, "")) {
            return this;
        }
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return new SavedStateDecoder(SavedStateReader.m13326getSavedStateimpl(bundle, this.key), this.configuration);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public boolean decodeBoolean() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13278getBooleanimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public byte decodeByte() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return (byte) SavedStateReader.m13300getIntimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public char decodeChar() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13282getCharimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public double decodeDouble() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13292getDoubleimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.c
    public int decodeElementIndex(q qVar) {
        int iM13349sizeimpl;
        String strC;
        x.f(qVar, "descriptor");
        if (x.n(qVar.h(), z.f50941a) || x.n(qVar.h(), aa.f50902a)) {
            Bundle bundle = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle);
            iM13349sizeimpl = SavedStateReader.m13349sizeimpl(bundle);
        } else {
            iM13349sizeimpl = qVar.b();
        }
        while (true) {
            int i2 = this.index;
            if (i2 >= iM13349sizeimpl) {
                return -1;
            }
            strC = qVar.c(i2);
            if (!qVar.i(this.index)) {
                break;
            }
            Bundle bundle2 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle2);
            if (SavedStateReader.m13270containsimpl(bundle2, strC)) {
                break;
            }
            this.index++;
        }
        this.key = strC;
        int i3 = this.index;
        this.index = i3 + 1;
        return i3;
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public int decodeEnum(q qVar) {
        x.f(qVar, "enumDescriptor");
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13300getIntimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public float decodeFloat() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13296getFloatimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public int decodeInt() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13300getIntimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public long decodeLong() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13310getLongimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public boolean decodeNotNullMark() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return !SavedStateReader.m13348isNullimpl(bundle, this.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public <T> T decodeSerializableValue(kotlinx.b.a<? extends T> aVar) {
        x.f(aVar, "deserializer");
        T t = (T) SavedStateDecoder_androidKt.decodeFormatSpecificTypesOnPlatform(this, aVar);
        if (t != null) {
            return t;
        }
        q descriptor = aVar.getDescriptor();
        if (x.n(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            Bundle bundle = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle);
            return (T) SavedStateReader.m13303getIntListimpl(bundle, this.key);
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            Bundle bundle2 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle2);
            return (T) SavedStateReader.m13343getStringListimpl(bundle2, this.key);
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getBooleanListDescriptor())) {
            Bundle bundle3 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle3);
            return (T) h.a.c.Y(SavedStateReader.m13279getBooleanArrayimpl(bundle3, this.key));
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getLongListDescriptor())) {
            Bundle bundle4 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle4);
            return (T) h.a.c.W(SavedStateReader.m13311getLongArrayimpl(bundle4, this.key));
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getFloatListDescriptor())) {
            Bundle bundle5 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle5);
            return (T) h.a.c.U(SavedStateReader.m13297getFloatArrayimpl(bundle5, this.key));
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getDoubleListDescriptor())) {
            Bundle bundle6 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle6);
            return (T) h.a.c.T(SavedStateReader.m13293getDoubleArrayimpl(bundle6, this.key));
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getCharListDescriptor())) {
            Bundle bundle7 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle7);
            char[] cArrM13283getCharArrayimpl = SavedStateReader.m13283getCharArrayimpl(bundle7, this.key);
            x.f(cArrM13283getCharArrayimpl, "<this>");
            int length = cArrM13283getCharArrayimpl.length;
            if (length == 0) {
                return (T) i.h();
            }
            if (length == 1) {
                return (T) i.d(Character.valueOf(cArrM13283getCharArrayimpl[0]));
            }
            x.f(cArrM13283getCharArrayimpl, "<this>");
            ArrayList arrayList = new ArrayList(length);
            for (char c2 : cArrM13283getCharArrayimpl) {
                arrayList.add(Character.valueOf(c2));
            }
            return (T) arrayList;
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            Bundle bundle8 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle8);
            return (T) SavedStateReader.m13279getBooleanArrayimpl(bundle8, this.key);
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            Bundle bundle9 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle9);
            return (T) SavedStateReader.m13283getCharArrayimpl(bundle9, this.key);
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            Bundle bundle10 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle10);
            return (T) SavedStateReader.m13293getDoubleArrayimpl(bundle10, this.key);
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            Bundle bundle11 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle11);
            return (T) SavedStateReader.m13297getFloatArrayimpl(bundle11, this.key);
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            Bundle bundle12 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle12);
            return (T) SavedStateReader.m13301getIntArrayimpl(bundle12, this.key);
        }
        if (x.n(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            Bundle bundle13 = this.savedState;
            SavedStateReader.m13269constructorimpl(bundle13);
            return (T) SavedStateReader.m13311getLongArrayimpl(bundle13, this.key);
        }
        if (!x.n(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return (T) super.decodeSerializableValue(aVar);
        }
        Bundle bundle14 = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle14);
        return (T) SavedStateReader.m13341getStringArrayimpl(bundle14, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public short decodeShort() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return (short) SavedStateReader.m13300getIntimpl(bundle, this.key);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public String decodeString() {
        Bundle bundle = this.savedState;
        SavedStateReader.m13269constructorimpl(bundle);
        return SavedStateReader.m13340getStringimpl(bundle, this.key);
    }

    public final String getKey$savedstate() {
        return this.key;
    }

    public final Bundle getSavedState$savedstate() {
        return this.savedState;
    }

    @Override // kotlinx.b.b.c
    public e getSerializersModule() {
        return this.configuration.getSerializersModule();
    }
}
