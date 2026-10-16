package androidx.room.migration.bundle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.i;
import h.e;
import h.g.b.o;
import h.g.b.x;
import h.n.a;
import h.o.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import kotlinx.b.a.q;
import kotlinx.b.b.d;
import kotlinx.b.c.ca;
import kotlinx.b.d.a.ad;
import kotlinx.b.d.a.ae;
import kotlinx.b.d.a.ah;
import kotlinx.b.d.a.l;
import kotlinx.b.d.a.v;
import kotlinx.b.d.b;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
public final class SchemaBundle implements SchemaEquality<SchemaBundle> {
    public static final Companion Companion = new Companion(null);
    private final DatabaseBundle database;
    private final int formatVersion;

    public /* synthetic */ SchemaBundle(int i2, int i3, DatabaseBundle databaseBundle, ca caVar) {
        if ((i2 & 3) != 3) {
            c.m(i2, 3, SchemaBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.formatVersion = i3;
        this.database = databaseBundle;
    }

    public static /* synthetic */ void getDatabase$annotations() {
    }

    public static /* synthetic */ void getFormatVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$room_migration(SchemaBundle schemaBundle, d dVar, q qVar) {
        dVar.encodeIntElement(qVar, 0, schemaBundle.formatVersion);
        dVar.encodeSerializableElement(qVar, 1, DatabaseBundle$$serializer.INSTANCE, schemaBundle.database);
    }

    public final DatabaseBundle getDatabase() {
        return this.database;
    }

    public final int getFormatVersion() {
        return this.formatVersion;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(SchemaBundle schemaBundle) {
        x.f(schemaBundle, "other");
        if (this.formatVersion == schemaBundle.formatVersion) {
            return SchemaEqualityUtil.INSTANCE.checkSchemaEquality(this.database, schemaBundle.database);
        }
        return false;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SchemaBundle deserialize(InputStream inputStream) throws IOException {
            x.f(inputStream, "fis");
            InputStream inputStream2 = inputStream;
            try {
                b json = SchemaBundleKt.getJson();
                Reader inputStreamReader = new InputStreamReader(inputStream2, a.f48221b);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                x.f(bufferedReader, "<this>");
                StringWriter stringWriter = new StringWriter();
                StringWriter stringWriter2 = stringWriter;
                x.f(bufferedReader, "<this>");
                x.f(stringWriter2, "out");
                char[] cArr = new char[8192];
                for (int i2 = bufferedReader.read(cArr); i2 >= 0; i2 = bufferedReader.read(cArr)) {
                    stringWriter2.write(cArr, 0, i2);
                }
                String string = stringWriter.toString();
                x.e(string, "toString(...)");
                json.b();
                kotlinx.b.b<SchemaBundle> bVarSerializer = SchemaBundle.Companion.serializer();
                x.f(bVarSerializer, "deserializer");
                x.f(string, TypedValues.Custom.S_STRING);
                kotlinx.b.d.a.a aVarD = kotlinx.coroutines.g.d.d(json, string);
                kotlinx.b.d.a.a aVar = aVarD;
                Object objDecodeSerializableValue = new ad(json, ah.f51143a, aVarD, bVarSerializer.getDescriptor(), null).decodeSerializableValue(bVarSerializer);
                if (aVarD.l() == 10) {
                    SchemaBundle schemaBundle = (SchemaBundle) objDecodeSerializableValue;
                    i.aW(inputStream2, null);
                    return schemaBundle;
                }
                kotlinx.b.d.a.a.s(aVarD, "Expected EOF after parsing, but had " + aVarD.o().charAt(aVarD.f51108a - 1) + " instead", 0, null, 6);
                throw new e();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    i.aW(inputStream2, th);
                    throw th2;
                }
            }
        }

        public final void serialize(SchemaBundle schemaBundle, OutputStream outputStream) throws IOException {
            x.f(schemaBundle, "bundle");
            x.f(outputStream, "outputStream");
            OutputStream outputStream2 = outputStream;
            try {
                OutputStream outputStream3 = outputStream2;
                b json = SchemaBundleKt.getJson();
                json.b();
                kotlinx.b.b<SchemaBundle> bVarSerializer = SchemaBundle.Companion.serializer();
                x.f(json, "<this>");
                x.f(bVarSerializer, "serializer");
                x.f(outputStream3, "stream");
                v vVar = new v(outputStream3);
                try {
                    x.f(json, "json");
                    x.f(vVar, "writer");
                    x.f(bVarSerializer, "serializer");
                    ah ahVar = ah.f51143a;
                    ae[] aeVarArr = new ae[ah.a().size()];
                    x.f(vVar, "output");
                    x.f(json, "json");
                    x.f(ahVar, "mode");
                    x.f(aeVarArr, "modeReuseCache");
                    x.f(vVar, "sb");
                    x.f(json, "json");
                    new ae(json.a().d() ? new l(vVar, json) : new kotlinx.b.d.a.i(vVar), json, ahVar, aeVarArr).encodeSerializableValue(bVarSerializer, schemaBundle);
                    i.aW(outputStream2, null);
                } finally {
                    vVar.a();
                }
            } finally {
            }
        }

        public final kotlinx.b.b<SchemaBundle> serializer() {
            return SchemaBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SchemaBundle(int i2, DatabaseBundle databaseBundle) {
        x.f(databaseBundle, "database");
        this.formatVersion = i2;
        this.database = databaseBundle;
    }
}
