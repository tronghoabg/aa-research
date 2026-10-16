package defpackage;

import java.io.ByteArrayInputStream;

/* loaded from: classes3.dex */
public final class aicq implements afdr {
    final /* synthetic */ ByteArrayInputStream $inputStream;
    final /* synthetic */ ahpi $parser;
    final /* synthetic */ aics this$0;

    public aicq(ahpi ahpiVar, ByteArrayInputStream byteArrayInputStream, aics aicsVar) {
        this.$parser = ahpiVar;
        this.$inputStream = byteArrayInputStream;
        this.this$0 = aicsVar;
    }

    @Override // defpackage.afdr
    public final ahpg invoke() {
        return (ahpg) this.$parser.parseDelimitedFrom(this.$inputStream, this.this$0.getC().getComponents().getExtensionRegistryLite());
    }
}
