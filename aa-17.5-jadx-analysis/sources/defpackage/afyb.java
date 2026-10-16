package defpackage;

/* loaded from: classes3.dex */
final class afyb implements afec {
    final /* synthetic */ afye this$0;

    public afyb(afye afyeVar) {
        this.this$0 = afyeVar;
    }

    @Override // defpackage.afec
    public agba invoke(ahnj ahnjVar) {
        agbd contributedClassifier = this.this$0.getBuiltInsPackageScope().getContributedClassifier(ahnjVar, aglr.FROM_BUILTINS);
        if (contributedClassifier != null) {
            if (contributedClassifier instanceof agba) {
                return (agba) contributedClassifier;
            }
            throw new AssertionError(a.bt(contributedClassifier, ahnjVar, "Must be a class descriptor ", ", but was "));
        }
        throw new AssertionError("Built-in class " + afyo.BUILT_INS_PACKAGE_FQ_NAME.child(ahnjVar) + " is not found");
    }
}
