package androidx.room.migration.bundle;

import h.g.b.o;
import h.g.b.x;
import h.o.c;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.d;
import kotlinx.b.c.ca;
import kotlinx.b.c.cf;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
public final class FieldBundle implements SchemaEquality<FieldBundle> {
    public static final Companion Companion = new Companion(null);
    private final String affinity;
    private final String columnName;
    private final String defaultValue;
    private final String fieldPath;
    private final boolean isNonNull;

    public /* synthetic */ FieldBundle(int i2, String str, String str2, String str3, boolean z, String str4, ca caVar) {
        if ((i2 & 7) != 7) {
            c.m(i2, 7, FieldBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.fieldPath = str;
        this.columnName = str2;
        this.affinity = str3;
        if ((i2 & 8) == 0) {
            this.isNonNull = false;
        } else {
            this.isNonNull = z;
        }
        this.defaultValue = (i2 & 16) == 0 ? null : str4;
    }

    public static /* synthetic */ void getAffinity$annotations() {
    }

    public static /* synthetic */ void getColumnName$annotations() {
    }

    public static /* synthetic */ void getDefaultValue$annotations() {
    }

    public static /* synthetic */ void getFieldPath$annotations() {
    }

    public static /* synthetic */ void isNonNull$annotations() {
    }

    public static final /* synthetic */ void write$Self$room_migration(FieldBundle fieldBundle, d dVar, q qVar) {
        dVar.encodeStringElement(qVar, 0, fieldBundle.fieldPath);
        dVar.encodeStringElement(qVar, 1, fieldBundle.columnName);
        dVar.encodeStringElement(qVar, 2, fieldBundle.affinity);
        if (dVar.shouldEncodeElementDefault(qVar, 3) || fieldBundle.isNonNull) {
            dVar.encodeBooleanElement(qVar, 3, fieldBundle.isNonNull);
        }
        if (!dVar.shouldEncodeElementDefault(qVar, 4) && fieldBundle.defaultValue == null) {
            return;
        }
        dVar.encodeNullableSerializableElement(qVar, 4, cf.f51036a, fieldBundle.defaultValue);
    }

    public final String getAffinity() {
        return this.affinity;
    }

    public final String getColumnName() {
        return this.columnName;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final String getFieldPath() {
        return this.fieldPath;
    }

    public final boolean isNonNull() {
        return this.isNonNull;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(FieldBundle fieldBundle) {
        x.f(fieldBundle, "other");
        if (this.isNonNull != fieldBundle.isNonNull || !x.n(this.columnName, fieldBundle.columnName)) {
            return false;
        }
        String str = this.defaultValue;
        if (str != null) {
            if (!x.n(str, fieldBundle.defaultValue)) {
                return false;
            }
        } else if (fieldBundle.defaultValue != null) {
            return false;
        }
        return x.n(this.affinity, fieldBundle.affinity);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<FieldBundle> serializer() {
            return FieldBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public FieldBundle(String str, String str2, String str3, boolean z, String str4) {
        x.f(str, "fieldPath");
        x.f(str2, "columnName");
        x.f(str3, "affinity");
        this.fieldPath = str;
        this.columnName = str2;
        this.affinity = str3;
        this.isNonNull = z;
        this.defaultValue = str4;
    }

    public /* synthetic */ FieldBundle(String str, String str2, String str3, boolean z, String str4, int i2, o oVar) {
        this(str, str2, str3, z & ((i2 & 8) == 0), (i2 & 16) != 0 ? null : str4);
    }
}
