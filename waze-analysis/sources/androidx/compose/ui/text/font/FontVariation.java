package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import h.a.c;
import h.e;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = new FontVariation();

    /* compiled from: WazeSource */
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    /* compiled from: WazeSource */
    final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(String str, float f2) {
            this.axisName = str;
            this.value = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            return x.n(getAxisName(), settingFloat.getAxisName()) && this.value == settingFloat.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.floatToIntBits(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(String str, int i2) {
            this.axisName = str;
            this.value = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            return x.n(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        public Settings(Setting... settingArr) {
            boolean z = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                int i2 = 0;
                for (Setting setting2 : settingArr) {
                    if (x.n(setting2.getAxisName(), axisName)) {
                        i2++;
                    }
                }
                if (i2 != 1) {
                    StringBuilder sb = new StringBuilder("'");
                    sb.append(axisName);
                    sb.append("' must be unique. Actual [");
                    ArrayList arrayList = new ArrayList();
                    for (Setting setting3 : settingArr) {
                        if (x.n(setting3.getAxisName(), axisName)) {
                            arrayList.add(setting3);
                        }
                    }
                    sb.append(arrayList);
                    sb.append(']');
                    InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
                }
                z = z || setting.getNeedsDensity();
            }
            this.settings = c.X(settingArr);
            this.needsDensity = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && x.n(this.settings, ((Settings) obj).settings);
        }

        public final boolean getNeedsDensity$ui_text() {
            return this.needsDensity;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }

        public String toString() {
            return "Settings(settings=" + this.settings + ')';
        }
    }

    private FontVariation() {
    }

    public final Setting Setting(String str, float f2) {
        if (str.length() != 4) {
            InlineClassHelperKt.throwIllegalArgumentException("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new SettingFloat(str, f2);
    }

    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m10684Settings6EWAqTQ(FontWeight fontWeight, int i2, Setting... settingArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(weight(fontWeight.getWeight()));
        arrayList.add(italic(i2));
        x.q(settingArr, arrayList);
        return new Settings((Setting[]) arrayList.toArray(new Setting[arrayList.size()]));
    }

    public final Setting grade(int i2) {
        if (i2 < -1000 || i2 >= 1001) {
            InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new SettingInt("GRAD", i2);
    }

    public final Setting italic(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: " + f2);
        }
        return new SettingFloat("ital", f2);
    }

    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m10685opticalSizingR2X_6o(long j2) {
        if (!TextUnit.m11365isSpimpl(j2)) {
            InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
        }
        return new SettingTextUnit("opsz", j2, null);
    }

    public final Setting slant(float f2) {
        if (f2 < -90.0f || f2 > 90.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: " + f2);
        }
        return new SettingFloat("slnt", f2);
    }

    public final Setting weight(int i2) {
        if (i2 <= 0 || i2 >= 1001) {
            InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: " + i2);
        }
        return new SettingInt("wght", i2);
    }

    public final Setting width(float f2) {
        if (f2 <= 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: " + f2);
        }
        return new SettingFloat("wdth", f2);
    }

    /* compiled from: WazeSource */
    final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        private SettingTextUnit(String str, long j2) {
            this.axisName = str;
            this.value = j2;
            this.needsDensity = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            return x.n(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m11359equalsimpl0(this.value, settingTextUnit.value);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m10686getValueXSAIIZE() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + TextUnit.m11363hashCodeimpl(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m11369toStringimpl(this.value)) + ')';
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density != null) {
                return TextUnit.m11362getValueimpl(this.value) * density.getFontScale();
            }
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            throw new e();
        }

        public /* synthetic */ SettingTextUnit(String str, long j2, o oVar) {
            this(str, j2);
        }
    }
}
