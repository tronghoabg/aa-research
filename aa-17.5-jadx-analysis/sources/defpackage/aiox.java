package defpackage;

/* loaded from: classes3.dex */
final class aiox extends aioy {
    final /* synthetic */ afec val$predicate;
    final /* synthetic */ boolean[] val$result;

    public aiox(afec afecVar, boolean[] zArr) {
        this.val$predicate = afecVar;
        this.val$result = zArr;
    }

    @Override // defpackage.aioy, defpackage.aipa
    public boolean beforeChildren(Object obj) {
        if (((Boolean) this.val$predicate.invoke(obj)).booleanValue()) {
            this.val$result[0] = true;
        }
        return !this.val$result[0];
    }

    @Override // defpackage.aipa
    public Boolean result() {
        return Boolean.valueOf(this.val$result[0]);
    }
}
