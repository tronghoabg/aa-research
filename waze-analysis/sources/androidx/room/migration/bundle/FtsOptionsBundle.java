package androidx.room.migration.bundle;

import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.o.c;
import java.util.List;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.d;
import kotlinx.b.c.as;
import kotlinx.b.c.ca;
import kotlinx.b.c.cf;
import kotlinx.b.c.e;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
public final class FtsOptionsBundle implements SchemaEquality<FtsOptionsBundle> {
    private final String contentTable;
    private final String languageIdColumnName;
    private final String matchInfo;
    private final List<String> notIndexedColumns;
    private final String preferredOrder;
    private final List<Integer> prefixSizes;
    private final String tokenizer;
    private final List<String> tokenizerArgs;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.FtsOptionsBundle$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return FtsOptionsBundle._childSerializers$_anonymous_();
        }
    }), null, null, null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.FtsOptionsBundle$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            return FtsOptionsBundle._childSerializers$_anonymous_$0();
        }
    }), g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.FtsOptionsBundle$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return FtsOptionsBundle._childSerializers$_anonymous_$1();
        }
    }), null};

    public FtsOptionsBundle(String str, List<String> list, String str2, String str3, String str4, List<String> list2, List<Integer> list3, String str5) {
        x.f(str, "tokenizer");
        x.f(list, "tokenizerArgs");
        x.f(str2, "contentTable");
        x.f(str3, "languageIdColumnName");
        x.f(str4, "matchInfo");
        x.f(list2, "notIndexedColumns");
        x.f(list3, "prefixSizes");
        x.f(str5, "preferredOrder");
        this.tokenizer = str;
        this.tokenizerArgs = list;
        this.contentTable = str2;
        this.languageIdColumnName = str3;
        this.matchInfo = str4;
        this.notIndexedColumns = list2;
        this.prefixSizes = list3;
        this.preferredOrder = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(cf.f51036a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$0() {
        return new e(cf.f51036a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$1() {
        return new e(as.f50970a);
    }

    public static /* synthetic */ void getContentTable$annotations() {
    }

    public static /* synthetic */ void getLanguageIdColumnName$annotations() {
    }

    public static /* synthetic */ void getMatchInfo$annotations() {
    }

    public static /* synthetic */ void getNotIndexedColumns$annotations() {
    }

    public static /* synthetic */ void getPreferredOrder$annotations() {
    }

    public static /* synthetic */ void getPrefixSizes$annotations() {
    }

    private static /* synthetic */ void getTokenizer$annotations() {
    }

    public static /* synthetic */ void getTokenizerArgs$annotations() {
    }

    public static final /* synthetic */ void write$Self$room_migration(FtsOptionsBundle ftsOptionsBundle, d dVar, q qVar) {
        f<b<Object>>[] fVarArr = $childSerializers;
        dVar.encodeStringElement(qVar, 0, ftsOptionsBundle.tokenizer);
        dVar.encodeSerializableElement(qVar, 1, fVarArr[1].getValue(), ftsOptionsBundle.tokenizerArgs);
        dVar.encodeStringElement(qVar, 2, ftsOptionsBundle.contentTable);
        dVar.encodeStringElement(qVar, 3, ftsOptionsBundle.languageIdColumnName);
        dVar.encodeStringElement(qVar, 4, ftsOptionsBundle.matchInfo);
        dVar.encodeSerializableElement(qVar, 5, fVarArr[5].getValue(), ftsOptionsBundle.notIndexedColumns);
        dVar.encodeSerializableElement(qVar, 6, fVarArr[6].getValue(), ftsOptionsBundle.prefixSizes);
        dVar.encodeStringElement(qVar, 7, ftsOptionsBundle.preferredOrder);
    }

    public final String getContentTable() {
        return this.contentTable;
    }

    public final String getLanguageIdColumnName() {
        return this.languageIdColumnName;
    }

    public final String getMatchInfo() {
        return this.matchInfo;
    }

    public final List<String> getNotIndexedColumns() {
        return this.notIndexedColumns;
    }

    public final String getPreferredOrder() {
        return this.preferredOrder;
    }

    public final List<Integer> getPrefixSizes() {
        return this.prefixSizes;
    }

    public final List<String> getTokenizerArgs() {
        return this.tokenizerArgs;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(FtsOptionsBundle ftsOptionsBundle) {
        x.f(ftsOptionsBundle, "other");
        return x.n(this.tokenizer, ftsOptionsBundle.tokenizer) && x.n(this.tokenizerArgs, ftsOptionsBundle.tokenizerArgs) && x.n(this.contentTable, ftsOptionsBundle.contentTable) && x.n(this.languageIdColumnName, ftsOptionsBundle.languageIdColumnName) && x.n(this.matchInfo, ftsOptionsBundle.matchInfo) && x.n(this.notIndexedColumns, ftsOptionsBundle.notIndexedColumns) && x.n(this.prefixSizes, ftsOptionsBundle.prefixSizes) && x.n(this.preferredOrder, ftsOptionsBundle.preferredOrder);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<FtsOptionsBundle> serializer() {
            return FtsOptionsBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ FtsOptionsBundle(int i2, String str, List list, String str2, String str3, String str4, List list2, List list3, String str5, ca caVar) {
        if ((i2 & 255) != 255) {
            c.m(i2, 255, FtsOptionsBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenizer = str;
        this.tokenizerArgs = list;
        this.contentTable = str2;
        this.languageIdColumnName = str3;
        this.matchInfo = str4;
        this.notIndexedColumns = list2;
        this.prefixSizes = list3;
        this.preferredOrder = str5;
    }
}
