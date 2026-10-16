.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;
.implements Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0015\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010%\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020$\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010(\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J!\u0010-\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010,\u00a2\u0006\u0004\u0008-\u0010.J#\u00102\u001a\u00020\u001b2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020*0/2\u0006\u0010!\u001a\u000201\u00a2\u0006\u0004\u00082\u00103J%\u00108\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u0002042\u0006\u00106\u001a\u0002052\u0006\u0010!\u001a\u000207\u00a2\u0006\u0004\u00088\u00109J\u0015\u0010;\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020:\u00a2\u0006\u0004\u0008;\u0010<J!\u0010=\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010:\u00a2\u0006\u0004\u0008=\u0010>J\r\u0010?\u001a\u00020\u001b\u00a2\u0006\u0004\u0008?\u0010\u001dJ\u001d\u0010B\u001a\u00020\u001b2\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020@0/H\u0016\u00a2\u0006\u0004\u0008B\u0010CJ%\u0010F\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020D2\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020@0/H\u0016\u00a2\u0006\u0004\u0008F\u0010GJ\r\u0010H\u001a\u00020\u001b\u00a2\u0006\u0004\u0008H\u0010\u001dJ\u0015\u0010I\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020,\u00a2\u0006\u0004\u0008I\u0010JJ\u0015\u0010M\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020K\u00a2\u0006\u0004\u0008M\u0010NJ\u0017\u0010O\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008O\u0010PJ\u0017\u0010Q\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\'H\u0002\u00a2\u0006\u0004\u0008Q\u0010)J\u0011\u0010S\u001a\u0004\u0018\u00010RH\u0002\u00a2\u0006\u0004\u0008S\u0010TJ\'\u0010U\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u0002042\u0006\u00106\u001a\u0002052\u0006\u0010!\u001a\u000207H\u0002\u00a2\u0006\u0004\u0008U\u00109J\'\u0010W\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u0002042\u0006\u00106\u001a\u00020V2\u0006\u0010!\u001a\u000207H\u0002\u00a2\u0006\u0004\u0008W\u0010XJ#\u0010\\\u001a\u00020\u001b2\u0008\u0010Z\u001a\u0004\u0018\u00010Y2\u0008\u0010[\u001a\u0004\u0018\u00010*H\u0002\u00a2\u0006\u0004\u0008\\\u0010]J\u0019\u0010_\u001a\u00020\u001b2\u0008\u0010^\u001a\u0004\u0018\u00010*H\u0002\u00a2\u0006\u0004\u0008_\u0010PJ/\u0010c\u001a\u0004\u0018\u00010a2\u0008\u0010^\u001a\u0004\u0018\u00010*2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020a0`H\u0002\u00a2\u0006\u0004\u0008c\u0010dJ%\u0010i\u001a\u00020\u001b2\u000c\u0010f\u001a\u0008\u0012\u0004\u0012\u00020e0/2\u0006\u0010h\u001a\u00020gH\u0002\u00a2\u0006\u0004\u0008i\u0010jJ)\u0010n\u001a\u00020\u001b2\u0006\u0010k\u001a\u00020@2\u0008\u0010l\u001a\u0004\u0018\u0001072\u0006\u0010m\u001a\u00020gH\u0002\u00a2\u0006\u0004\u0008n\u0010oJ!\u0010p\u001a\u00020\u001b2\u0008\u0010!\u001a\u0004\u0018\u0001072\u0006\u0010E\u001a\u00020gH\u0002\u00a2\u0006\u0004\u0008p\u0010qJ\u0017\u0010r\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020gH\u0002\u00a2\u0006\u0004\u0008r\u0010sJE\u0010w\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020v0`2\u0006\u0010k\u001a\u00020@2\u0006\u0010t\u001a\u00020a2\u0018\u0010u\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0/0`H\u0002\u00a2\u0006\u0004\u0008w\u0010xJQ\u0010{\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020v0`2\u000c\u0010y\u001a\u0008\u0012\u0004\u0012\u00020e0/2\u000c\u0010b\u001a\u0008\u0012\u0004\u0012\u00020a0z2\u0018\u0010u\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0/0`H\u0002\u00a2\u0006\u0004\u0008{\u0010|J,\u0010\u0080\u0001\u001a\u0004\u0018\u00010v2\u0006\u0010}\u001a\u00020*2\u0006\u0010\u007f\u001a\u00020~2\u0006\u0010t\u001a\u00020aH\u0002\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J-\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020v0`2\r\u0010\u0082\u0001\u001a\u0008\u0012\u0004\u0012\u00020v0/H\u0002\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J&\u0010\u0087\u0001\u001a\u00020v2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010v2\u0007\u0010\u0086\u0001\u001a\u00020vH\u0002\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020\u001bH\u0002\u00a2\u0006\u0005\u0008\u0089\u0001\u0010\u001dJ\u001c\u0010\u008c\u0001\u001a\u00020\u001b2\u0008\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001J\"\u0010\u008e\u0001\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u008f\u0001J*\u0010\u0092\u0001\u001a\u00020 2\r\u0010\u0090\u0001\u001a\u0008\u0012\u0004\u0012\u00020@0/2\u0007\u0010\u0091\u0001\u001a\u00020 H\u0002\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0093\u0001J\u001c\u0010\u0094\u0001\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010 H\u0002\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u001bH\u0002\u00a2\u0006\u0005\u0008\u0096\u0001\u0010\u001dJ\u001c\u0010\u0099\u0001\u001a\u00020\u001b2\u0008\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u001bH\u0002\u00a2\u0006\u0005\u0008\u009b\u0001\u0010\u001dJ\u001e\u0010\u009d\u0001\u001a\u00020\u001b2\u000b\u0008\u0002\u0010\u009c\u0001\u001a\u0004\u0018\u00010gH\u0002\u00a2\u0006\u0005\u0008\u009d\u0001\u0010sJ\u0011\u0010\u009e\u0001\u001a\u00020\u001bH\u0002\u00a2\u0006\u0005\u0008\u009e\u0001\u0010\u001dJ\u001e\u0010\u00a0\u0001\u001a\u00020\u001b2\u000b\u0008\u0002\u0010\u009f\u0001\u001a\u0004\u0018\u00010gH\u0002\u00a2\u0006\u0005\u0008\u00a0\u0001\u0010sJ\u001e\u0010\u00a2\u0001\u001a\u00020\u001b2\u000b\u0008\u0002\u0010\u00a1\u0001\u001a\u0004\u0018\u00010gH\u0002\u00a2\u0006\u0005\u0008\u00a2\u0001\u0010sJ(\u0010\u00a5\u0001\u001a\u00020\u001b2\u0014\u0010\u00a4\u0001\u001a\u000f\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u00a3\u00010`H\u0002\u00a2\u0006\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001J\u0019\u0010\u00a7\u0001\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020gH\u0002\u00a2\u0006\u0005\u0008\u00a7\u0001\u0010sJG\u0010\u00ab\u0001\u001a\u00020\u001b2\u0015\u0010\u00a9\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0004\u0012\u00020\u001b0\u00a8\u00012\u0014\u0010\u00aa\u0001\u001a\u000f\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u001b0\u00a8\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001J(\u0010\u00ae\u0001\u001a\u00020\u001b2\r\u0010\u00ad\u0001\u001a\u0008\u0012\u0004\u0012\u00020$0/2\u0006\u0010E\u001a\u00020gH\u0002\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010jJT\u0010\u00af\u0001\u001a\u00020\u001b2 \u0010\u00a9\u0001\u001a\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020v0`\u0012\u0004\u0012\u00020\u001b0\u00a8\u00012\u0014\u0010\u00aa\u0001\u001a\u000f\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u001b0\u00a8\u00012\u0008\u0010E\u001a\u0004\u0018\u00010gH\u0002\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J\u0011\u0010\u00b1\u0001\u001a\u00020\u001bH\u0002\u00a2\u0006\u0005\u0008\u00b1\u0001\u0010\u001dJ\u001f\u0010\u00b2\u0001\u001a\u00020\u001b2\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020@0/H\u0002\u00a2\u0006\u0005\u0008\u00b2\u0001\u0010CJ/\u0010\u00b6\u0001\u001a\u00020\u001b2\u0006\u0010k\u001a\u00020@2\u0008\u0010\u00b4\u0001\u001a\u00030\u00b3\u00012\t\u0010\u00b5\u0001\u001a\u0004\u0018\u00010aH\u0002\u00a2\u0006\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001J\u001b\u0010\u00b9\u0001\u001a\u00030\u00b8\u00012\u0006\u0010E\u001a\u00020gH\u0002\u00a2\u0006\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001J#\u0010\u00bb\u0001\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0008\u0010!\u001a\u0004\u0018\u00010,H\u0002\u00a2\u0006\u0005\u0008\u00bb\u0001\u0010.J\u0019\u0010\u00bc\u0001\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0005\u0008\u00bc\u0001\u0010PJ\"\u0010\u00bd\u0001\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u0010E\u001a\u00020gH\u0002\u00a2\u0006\u0006\u0008\u00bd\u0001\u0010\u00be\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0004\u0010\u00bf\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0006\u0010\u00c0\u0001R\u0015\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0008\u0010\u00c1\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\n\u0010\u00c2\u0001R\u0015\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000c\u0010\u00c3\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000e\u0010\u00c4\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0010\u0010\u00c5\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0012\u0010\u00c6\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0014\u0010\u00c7\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0016\u0010\u00c8\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0018\u0010\u00c9\u0001R\u001a\u0010\u00ca\u0001\u001a\u00030\u00b8\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R\u001b\u0010\u00cc\u0001\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001R \u0010\u00cf\u0001\u001a\t\u0012\u0004\u0012\u00020$0\u00ce\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001R \u0010\u00d1\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u00ce\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d1\u0001\u0010\u00d0\u0001R&\u0010\u00d3\u0001\u001a\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u0002070\u00d2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d3\u0001\u0010\u00d4\u0001R \u0010\u00d5\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u00ce\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d5\u0001\u0010\u00d0\u0001R\u001b\u0010\u00d6\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d6\u0001\u0010\u00d7\u0001R\u001b\u0010\u00d8\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d8\u0001\u0010\u00d7\u0001R-\u0010\u00d9\u0001\u001a\u0016\u0012\u0004\u0012\u00020*\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020,0\u00ce\u00010\u00d2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d9\u0001\u0010\u00d4\u0001R\u001a\u0010\u00da\u0001\u001a\u00030\u00b8\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00da\u0001\u0010\u00cb\u0001R\u0019\u0010\u00db\u0001\u001a\u00020~8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00db\u0001\u0010\u00dc\u0001R\u001b\u0010\u00dd\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00dd\u0001\u0010\u00d7\u0001R\u001c\u0010\u00de\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0001\u0010\u00df\u0001R\u001f\u0010\u00e0\u0001\u001a\u0008\u0012\u0004\u0012\u00020@0/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e0\u0001\u0010\u00d0\u0001R\u001a\u0010\u00e2\u0001\u001a\u00030\u00e1\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e2\u0001\u0010\u00e3\u0001R-\u0010\u00e8\u0001\u001a\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020Y0\u00d2\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00e4\u0001\u0010\u00e5\u0001\u001a\u0006\u0008\u00e6\u0001\u0010\u00e7\u0001R4\u0010\u00eb\u0001\u001a\u00030\u00e9\u00012\u0008\u0010\u00ea\u0001\u001a\u00030\u00e9\u00018F@FX\u0086.\u00a2\u0006\u0018\n\u0006\u0008\u00eb\u0001\u0010\u00ec\u0001\u001a\u0006\u0008\u00ed\u0001\u0010\u00ee\u0001\"\u0006\u0008\u00ef\u0001\u0010\u00f0\u0001R\u0018\u0010\u00f1\u0001\u001a\u00030\u00b8\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f1\u0001\u0010\u00f2\u0001R\u0018\u0010\u00f3\u0001\u001a\u00030\u00b8\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f3\u0001\u0010\u00f2\u0001\u00a8\u0006\u00f4\u0001"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;",
        "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;",
        "Landroid/app/Application;",
        "context",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "purchasesCache",
        "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;",
        "handledPurchasesCache",
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "launchResultCache",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "userInfoService",
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "identityManager",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "remoteConfigManager",
        "<init>",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V",
        "Lef/C;",
        "onAppForeground",
        "()V",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "requestTrigger",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "callback",
        "launch",
        "(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
        "loadProducts",
        "(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;",
        "offerings",
        "(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V",
        "",
        "identityId",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
        "identify",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V",
        "",
        "productIds",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "checkTrialIntroEligibilityForProductIds",
        "(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V",
        "Landroid/app/Activity;",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;",
        "purchaseModel",
        "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
        "purchaseProduct",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "checkEntitlements",
        "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "restore",
        "(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "syncPurchases",
        "Lcom/android/billingclient/api/Purchase;",
        "purchases",
        "onPurchasesCompleted",
        "(Ljava/util/List;)V",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "error",
        "onPurchasesFailed",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;)V",
        "logout",
        "getUserInfo",
        "(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "entitlementsUpdateListener",
        "setEntitlementsUpdateListener",
        "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "processIdentity",
        "(Ljava/lang/String;)V",
        "executeOfferingCallback",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "getOfferings",
        "()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "tryToPurchase",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;",
        "processPurchase",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "options",
        "storeProductId",
        "updatePurchaseOptions",
        "(Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Ljava/lang/String;)V",
        "productId",
        "removePurchaseOptions",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "products",
        "getProductForPurchase",
        "(Ljava/lang/String;Ljava/util/Map;)Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "purchaseHistoryRecords",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "restoreError",
        "calculateRestorePermissionsLocally",
        "(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "purchase",
        "purchaseCallback",
        "purchaseError",
        "calculatePurchasePermissionsLocally",
        "(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "failLocallyGrantingPurchasePermissionsWithError",
        "(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "failLocallyGrantingRestorePermissionsWithError",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "purchasedProduct",
        "productPermissions",
        "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "grantPermissionsAfterFailedPurchaseTracking",
        "(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/util/Map;)Ljava/util/Map;",
        "historyRecords",
        "",
        "grantPermissionsAfterFailedRestore",
        "(Ljava/util/List;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;",
        "id",
        "",
        "purchaseTime",
        "createPermission",
        "(Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "newPermissions",
        "mergeManuallyCreatedPermissions",
        "(Ljava/util/List;)Ljava/util/Map;",
        "existingPermission",
        "localCreatedPermission",
        "choosePermissionToSave",
        "(Lcom/qonversion/android/sdk/internal/dto/QPermission;Lcom/qonversion/android/sdk/internal/dto/QPermission;)Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "processPendingInitIfAvailable",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;",
        "initRequestData",
        "processInit",
        "(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V",
        "continueLaunchWithPurchasesInfo",
        "(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V",
        "trackingPurchases",
        "outerCallback",
        "getWrappedPurchasesCallback",
        "(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "getLaunchCallback",
        "(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "handleLogout",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "launchResult",
        "updateLaunchResult",
        "(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V",
        "loadStoreProductsIfPossible",
        "lastError",
        "handlePendingRequests",
        "handleCachedPurchases",
        "loadStoreProductsError",
        "executeProductsBlocks",
        "actualError",
        "executeEntitlementsBlock",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
        "entitlements",
        "executeRestoreBlocksOnSuccess",
        "(Ljava/util/Map;)V",
        "executeRestoreBlocksOnError",
        "Lkotlin/Function1;",
        "onSuccess",
        "onError",
        "retryLaunch",
        "(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V",
        "callbacks",
        "fireProductsFailure",
        "preparePermissionsResult",
        "(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "handlePendingPurchases",
        "handlePurchases",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "purchaseInfo",
        "product",
        "storeFailedPurchaseIfNecessary",
        "(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V",
        "",
        "shouldCalculatePermissionsLocally",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)Z",
        "addIdentityCallback",
        "fireIdentitySuccess",
        "fireIdentityError",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "Landroid/app/Application;",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;",
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "isRestoreInProgress",
        "Z",
        "launchError",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "",
        "productsCallbacks",
        "Ljava/util/List;",
        "entitlementCallbacks",
        "",
        "purchasingCallbacks",
        "Ljava/util/Map;",
        "restoreCallbacks",
        "processingPartnersIdentityId",
        "Ljava/lang/String;",
        "pendingPartnersIdentityId",
        "pendingIdentityCallbacks",
        "unhandledLogoutAvailable",
        "installDate",
        "J",
        "advertisingID",
        "pendingInitRequestData",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;",
        "processingPurchases",
        "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;",
        "converter",
        "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;",
        "processingPurchaseOptions$delegate",
        "Lef/i;",
        "getProcessingPurchaseOptions",
        "()Ljava/util/Map;",
        "processingPurchaseOptions",
        "Lcom/qonversion/android/sdk/internal/billing/BillingService;",
        "<set-?>",
        "billingService",
        "Lcom/qonversion/android/sdk/internal/billing/BillingService;",
        "getBillingService",
        "()Lcom/qonversion/android/sdk/internal/billing/BillingService;",
        "setBillingService",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingService;)V",
        "isUserStable",
        "()Z",
        "isLaunchingFinished",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private advertisingID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile billingService:Lcom/qonversion/android/sdk/internal/billing/BillingService;

.field private final context:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private converter:Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private entitlementCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final handledPurchasesCache:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private installDate:J

.field private final internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isRestoreInProgress:Z

.field private launchError:Lcom/qonversion/android/sdk/dto/QonversionError;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private pendingIdentityCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private pendingInitRequestData:Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pendingPartnersIdentityId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private processingPartnersIdentityId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final processingPurchaseOptions$delegate:Lef/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private processingPurchases:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private productsCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private purchasingCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private restoreCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private unhandledLogoutAvailable:Z

.field private final userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/logger/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/qonversion/android/sdk/internal/QIdentityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "repository"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "logger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "purchasesCache"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "handledPurchasesCache"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "launchResultCache"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "userInfoService"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "identityManager"

    .line 37
    .line 38
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "internalConfig"

    .line 42
    .line 43
    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "appStateProvider"

    .line 47
    .line 48
    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "remoteConfigManager"

    .line 52
    .line 53
    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->context:Landroid/app/Application;

    .line 60
    .line 61
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 62
    .line 63
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 64
    .line 65
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 66
    .line 67
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handledPurchasesCache:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 68
    .line 69
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 70
    .line 71
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 72
    .line 73
    iput-object p8, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    .line 74
    .line 75
    iput-object p9, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 76
    .line 77
    iput-object p10, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 78
    .line 79
    iput-object p11, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 80
    .line 81
    new-instance p2, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    .line 87
    .line 88
    new-instance p2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    .line 94
    .line 95
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 101
    .line 102
    new-instance p2, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    .line 108
    .line 109
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 110
    .line 111
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    .line 115
    .line 116
    sget-object p2, Lff/v;->a:Lff/v;

    .line 117
    .line 118
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchases:Ljava/util/List;

    .line 119
    .line 120
    new-instance p2, Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;

    .line 121
    .line 122
    invoke-direct {p2}, Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->converter:Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    .line 126
    .line 127
    new-instance p2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processingPurchaseOptions$2;

    .line 128
    .line 129
    invoke-direct {p2, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processingPurchaseOptions$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p2}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchaseOptions$delegate:Lef/i;

    .line 137
    .line 138
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 139
    .line 140
    const/16 p3, 0x21

    .line 141
    .line 142
    if-lt p2, p3, :cond_0

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {}, LG6/T;->B()Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    invoke-static {p2, p1, p3}, Lea/T;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    goto :goto_0

    .line 161
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const/16 p3, 0x80

    .line 170
    .line 171
    invoke-virtual {p2, p1, p3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    :goto_0
    iget-wide p1, p1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 176
    .line 177
    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->milliSecondsToSeconds(J)J

    .line 178
    .line 179
    .line 180
    move-result-wide p1

    .line 181
    iput-wide p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    .line 182
    .line 183
    return-void
.end method

.method public static final synthetic access$calculatePurchasePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->calculatePurchasePermissionsLocally(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$calculateRestorePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->calculateRestorePermissionsLocally(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$createPermission(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->createPermission(Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$executeEntitlementsBlock(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$executeOfferingCallback(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeOfferingCallback(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$executeProductsBlocks(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeProductsBlocks(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$executeRestoreBlocksOnSuccess(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeRestoreBlocksOnSuccess(Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$fireIdentityError(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->fireIdentityError(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$fireIdentitySuccess(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->fireIdentitySuccess(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getAdvertisingID$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->advertisingID:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getConverter$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->converter:Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getHandledPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handledPurchasesCache:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getInstallDate$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getInternalConfig$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/InternalConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLaunchResultCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getProcessingPurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchases:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRemoteConfigManager$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRepository$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getWrappedPurchasesCallback(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getWrappedPurchasesCallback(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$handleCachedPurchases(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handleCachedPurchases()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handlePendingRequests(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handlePurchases(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePurchases(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$loadStoreProductsIfPossible(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadStoreProductsIfPossible()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$processIdentity(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processIdentity(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$processInit(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processInit(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$purchaseProduct$tryToPurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct$tryToPurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$removePurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->removePurchaseOptions(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setAdvertisingID$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->advertisingID:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLaunchError$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setPendingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setProcessingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchases:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setUnhandledLogoutAvailable$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$storeFailedPurchaseIfNecessary(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$updateLaunchResult(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->updateLaunchResult(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final addIdentityCallback(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/util/List;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final calculatePurchasePermissionsLocally(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 14
    .line 15
    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingPurchasePermissionsWithError(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getProductPermissions()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingPurchasePermissionsWithError(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v3, v2

    .line 62
    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 63
    .line 64
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    const/4 v2, 0x0

    .line 80
    :goto_0
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 81
    .line 82
    if-nez v2, :cond_5

    .line 83
    .line 84
    invoke-direct {p0, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingPurchasePermissionsWithError(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    invoke-direct {p0, p1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->grantPermissionsAfterFailedPurchaseTracking(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/util/Map;)Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    if-eqz p2, :cond_6

    .line 93
    .line 94
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-interface {p2, p3, p1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onSuccess(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V

    .line 99
    .line 100
    .line 101
    :cond_6
    return-void
.end method

.method private final calculateRestorePermissionsLocally(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 14
    .line 15
    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :cond_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingRestorePermissionsWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getProductPermissions()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->failLocallyGrantingRestorePermissionsWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-direct {p0, p1, p2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->grantPermissionsAfterFailedRestore(Ljava/util/List;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeRestoreBlocksOnSuccess(Ljava/util/Map;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private final choosePermissionToSave(Lcom/qonversion/android/sdk/internal/dto/QPermission;Lcom/qonversion/android/sdk/internal/dto/QPermission;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getExpirationDate()Ljava/util/Date;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-wide v1, 0x7fffffffffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-wide v3, v1

    .line 21
    :goto_0
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getExpirationDate()Ljava/util/Date;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    :cond_2
    cmp-long v0, v3, v1

    .line 32
    .line 33
    if-lez v0, :cond_3

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    const/4 v0, 0x0

    .line 38
    :goto_1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->isActive()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_5

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_4
    return-object p1

    .line 48
    :cond_5
    :goto_2
    return-object p2
.end method

.method private final continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;

    .line 11
    .line 12
    invoke-direct {v2, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->queryPurchases(Ltf/l;Ltf/l;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static final continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    .line 4
    .line 5
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->advertisingID:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    move-object v5, p1

    .line 9
    move-object v6, p2

    .line 10
    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processInit(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final createPermission(Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 26

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p4 .. p4}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QProductType;->InApp:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    move-object/from16 v2, p0

    .line 13
    .line 14
    move-object v3, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object/from16 v2, p0

    .line 17
    .line 18
    iget-object v3, v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 19
    .line 20
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getCacheConfig()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->getEntitlementsCacheLifetime()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->getDays()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    sget-object v5, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Year:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 33
    .line 34
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->getDays()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :goto_0
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    new-instance v5, Ljava/util/Date;

    .line 53
    .line 54
    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getDaysToMs(I)J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    add-long/2addr v6, v0

    .line 59
    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 60
    .line 61
    .line 62
    move-object v13, v5

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object v13, v4

    .line 65
    :goto_1
    if-eqz v13, :cond_3

    .line 66
    .line 67
    new-instance v3, Ljava/util/Date;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v13}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-gez v3, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    return-object v4

    .line 80
    :cond_3
    :goto_2
    new-instance v8, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 81
    .line 82
    invoke-virtual/range {p4 .. p4}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    sget-object v11, Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;->Unknown:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    .line 87
    .line 88
    new-instance v12, Ljava/util/Date;

    .line 89
    .line 90
    invoke-direct {v12, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 91
    .line 92
    .line 93
    sget-object v14, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;->PlayStore:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 94
    .line 95
    sget-object v21, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;->Purchase:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    .line 96
    .line 97
    const/16 v24, 0x4000

    .line 98
    .line 99
    const/16 v25, 0x0

    .line 100
    .line 101
    const/4 v15, 0x1

    .line 102
    const/16 v16, 0x0

    .line 103
    .line 104
    const/16 v17, 0x0

    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    const/16 v19, 0x0

    .line 109
    .line 110
    const/16 v20, 0x0

    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    const/16 v23, 0x0

    .line 115
    .line 116
    move-object/from16 v9, p1

    .line 117
    .line 118
    invoke-direct/range {v8 .. v25}, Lcom/qonversion/android/sdk/internal/dto/QPermission;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    return-object v8
.end method

.method private final declared-synchronized executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$1;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$1;-><init>(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2;

    .line 31
    .line 32
    invoke-direct {v2, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2;-><init>(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->preparePermissionsResult(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw p1
.end method

.method public static synthetic executeEntitlementsBlock$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final executeOfferingCallback(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->getAvailableOfferings()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getProducts()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v3, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->enrichStoreData(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/offerings/QOfferings;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    new-instance v1, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 50
    .line 51
    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->OfferingsNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 52
    .line 53
    const/4 v5, 0x6

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 58
    .line 59
    .line 60
    move-object v0, v1

    .line 61
    :cond_2
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private final declared-synchronized executeProductsBlocks(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->fireProductsFailure(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    :try_start_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    new-instance v1, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 49
    .line 50
    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 51
    .line 52
    const/4 v5, 0x6

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v1

    .line 60
    :cond_2
    invoke-direct {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->fireProductsFailure(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return-void

    .line 65
    :cond_3
    :try_start_3
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-static {p1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->enrichStoreData(Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    check-cast v0, Ljava/lang/Iterable;

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_7

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    move-object v2, p1

    .line 103
    check-cast v2, Ljava/lang/Iterable;

    .line 104
    .line 105
    const/16 v3, 0xa

    .line 106
    .line 107
    invoke-static {v2, v3}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v3}, Lff/B;->D(I)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    const/16 v4, 0x10

    .line 116
    .line 117
    if-ge v3, v4, :cond_5

    .line 118
    .line 119
    move v3, v4

    .line 120
    :cond_5
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_6

    .line 134
    .line 135
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    move-object v5, v3

    .line 140
    check-cast v5, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 141
    .line 142
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    invoke-interface {v1, v4}, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;->onSuccess(Ljava/util/Map;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_7
    monitor-exit p0

    .line 155
    return-void

    .line 156
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 157
    throw p1
.end method

.method public static synthetic executeProductsBlocks$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeProductsBlocks(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private final executeRestoreBlocksOnSuccess(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onSuccess(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x1

    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-static {p0, v0, p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private final failLocallyGrantingPurchasePermissionsWithError(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->clearPermissionsCache()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private final failLocallyGrantingRestorePermissionsWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->clearPermissionsCache()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeRestoreBlocksOnError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final fireIdentityError(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    check-cast v0, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    .line 39
    .line 40
    invoke-interface {v0, p2}, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    :goto_1
    return-void
.end method

.method private final fireIdentitySuccess(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingIdentityCallbacks:Ljava/util/Map;

    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    new-instance p1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$fireIdentitySuccess$1;

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$fireIdentitySuccess$1;-><init>(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getUserInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final fireProductsFailure(Ljava/util/List;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            ")V"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0, p2}, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method private final getLaunchCallback(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final getOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final getProcessingPurchaseOptions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPurchaseOptions$delegate:Lef/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getProductForPurchase(Ljava/lang/String;Ljava/util/Map;)Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 10
    .line 11
    return-object p1
.end method

.method private final getWrappedPurchasesCallback(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            ")",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getWrappedPurchasesCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final grantPermissionsAfterFailedPurchaseTracking(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/Purchase;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    check-cast p3, Ljava/util/List;

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    check-cast p3, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getPurchaseTime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-direct {p0, v1, v2, v3, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->createPermission(Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object v0, Lff/v;->a:Lff/v;

    .line 51
    .line 52
    :cond_2
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->mergeManuallyCreatedPermissions(Ljava/util/List;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method

.method private final grantPermissionsAfterFailedRestore(Ljava/util/List;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Ljava/util/Collection<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-static {p1}, Lff/o;->j0(Ljava/lang/Iterable;)LAf/o;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;

    .line 8
    .line 9
    invoke-direct {v0, p2, p3, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;-><init>(Ljava/util/Collection;Ljava/util/Map;Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 10
    .line 11
    .line 12
    new-instance p2, LAf/h;

    .line 13
    .line 14
    sget-object p3, LAf/u;->a:LAf/u;

    .line 15
    .line 16
    invoke-direct {p2, p1, v0, p3}, LAf/h;-><init>(LAf/k;Ltf/l;Ltf/l;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, LAd/g;

    .line 20
    .line 21
    const/4 p3, 0x4

    .line 22
    invoke-direct {p1, p3}, LAd/g;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2, p1}, LAf/n;->W(LAf/k;Ltf/l;)LAf/g;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance p3, LAf/f;

    .line 35
    .line 36
    invoke-direct {p3, p1}, LAf/f;-><init>(LAf/g;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p3}, LAf/f;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p3}, LAf/f;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    move-object v0, p1

    .line 50
    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getPermissionID()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-nez v1, :cond_0

    .line 61
    .line 62
    new-instance v1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-eqz p3, :cond_2

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    check-cast p3, Ljava/util/Map$Entry;

    .line 104
    .line 105
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    check-cast p3, Ljava/util/List;

    .line 110
    .line 111
    invoke-static {p3}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    check-cast p3, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 116
    .line 117
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-static {p1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->mergeManuallyCreatedPermissions(Ljava/util/List;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1
.end method

.method private final handleCachedPurchases()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->loadPurchases()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v5, v1

    .line 24
    check-cast v5, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 27
    .line 28
    iget-wide v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    .line 29
    .line 30
    new-instance v7, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handleCachedPurchases$1$1;

    .line 31
    .line 32
    invoke-direct {v7, p0, v5}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handleCachedPurchases$1$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    .line 33
    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-interface/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->purchase(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method private final handleLogout()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 3
    .line 4
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Logout:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-static {p0, v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final handlePendingPurchases()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePendingPurchases$1;->INSTANCE:Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePendingPurchases$1;

    .line 13
    .line 14
    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePendingPurchases$2;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePendingPurchases$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->queryPurchases(Ltf/l;Ltf/l;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final handlePendingRequests(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 8
    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x2

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {p0, v0, v1, p1, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handleLogout()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->handlePendingRequests()V

    .line 47
    .line 48
    .line 49
    :cond_4
    :goto_1
    return-void
.end method

.method public static synthetic handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final handlePurchases(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->consumePurchases(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_7

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v5, v0

    .line 25
    check-cast v5, Lcom/android/billingclient/api/Purchase;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 28
    .line 29
    invoke-static {v5}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v4, v0

    .line 38
    check-cast v4, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 41
    .line 42
    invoke-static {v5}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v0}, Lkotlin/jvm/internal/K;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Lcom/android/billingclient/api/Purchase;->getPurchaseState()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_6

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    if-eq v0, v1, :cond_5

    .line 61
    .line 62
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handledPurchasesCache:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 63
    .line 64
    invoke-virtual {v0, v5}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;->shouldHandlePurchase(Lcom/android/billingclient/api/Purchase;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v1, 0x0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    check-cast v0, Ljava/lang/Iterable;

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v3, v2

    .line 102
    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 103
    .line 104
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v5}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    move-object v2, v1

    .line 120
    :goto_1
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 121
    .line 122
    move-object v3, v2

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    move-object v3, v1

    .line 125
    :goto_2
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v5}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 138
    .line 139
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->converter:Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    .line 140
    .line 141
    invoke-interface {v2, v5, v0}, Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;->convertPurchase(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 146
    .line 147
    iget-wide v7, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    .line 148
    .line 149
    if-eqz v3, :cond_4

    .line 150
    .line 151
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    :cond_4
    move-object v10, v1

    .line 156
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;

    .line 157
    .line 158
    move-object v2, p0

    .line 159
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    .line 160
    .line 161
    .line 162
    move-object v11, v1

    .line 163
    move-object v9, v6

    .line 164
    move-object v6, v0

    .line 165
    invoke-interface/range {v6 .. v11}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->purchase(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_5
    if-eqz v4, :cond_0

    .line 171
    .line 172
    new-instance v5, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 173
    .line 174
    sget-object v6, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchasePending:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 175
    .line 176
    const/4 v9, 0x6

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v7, 0x0

    .line 179
    const/4 v8, 0x0

    .line 180
    invoke-direct/range {v5 .. v10}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v4, v5}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_6
    if-eqz v4, :cond_0

    .line 189
    .line 190
    new-instance v6, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 191
    .line 192
    sget-object v7, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseUnspecified:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 193
    .line 194
    const/4 v10, 0x6

    .line 195
    const/4 v11, 0x0

    .line 196
    const/4 v8, 0x0

    .line 197
    const/4 v9, 0x0

    .line 198
    invoke-direct/range {v6 .. v11}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v4, v6}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_7
    return-void
.end method

.method public static synthetic identify$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final isLaunchingFinished()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getSessionLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public static synthetic launch$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final loadStoreProductsIfPossible()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 14
    .line 15
    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 16
    .line 17
    const/4 v5, 0x6

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    move-object v0, v1

    .line 25
    :cond_0
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeProductsBlocks(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Iterable;

    .line 38
    .line 39
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$loadStoreProductsIfPossible$1;

    .line 44
    .line 45
    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$loadStoreProductsIfPossible$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Lcom/qonversion/android/sdk/internal/QProductCenterManager$loadStoreProductsIfPossible$2;

    .line 49
    .line 50
    invoke-direct {v3, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$loadStoreProductsIfPossible$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, v0, v2, v3}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->enrichStoreDataAsync(Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private final mergeManuallyCreatedPermissions(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualPermissions()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lff/w;->a:Lff/w;

    .line 10
    .line 11
    :cond_0
    invoke-static {v0}, Lff/A;->a0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast p1, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getPermissionID()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 42
    .line 43
    invoke-direct {p0, v3, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->choosePermissionToSave(Lcom/qonversion/android/sdk/internal/dto/QPermission;Lcom/qonversion/android/sdk/internal/dto/QPermission;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->updatePermissions(Ljava/util/Map;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method private final preparePermissionsResult(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            "Ltf/l;",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualPermissions()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lff/w;->a:Lff/w;

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_4

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 48
    .line 49
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getExpirationDate()Ljava/util/Date;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    if-eqz v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const-wide v6, 0x7fffffffffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 70
    .line 71
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->isActive()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    cmp-long v5, v6, v1

    .line 78
    .line 79
    if-gez v5, :cond_2

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    :cond_4
    :goto_1
    if-eqz p3, :cond_5

    .line 83
    .line 84
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getShouldFireFallback(Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    :cond_5
    if-eqz v4, :cond_6

    .line 91
    .line 92
    invoke-interface {p1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    if-eqz p3, :cond_7

    .line 97
    .line 98
    invoke-interface {p2, p3}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_7
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->preparePermissionsResult$actualizePermissions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ltf/l;Ltf/l;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method private static final preparePermissionsResult$actualizePermissions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ltf/l;Ltf/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$1;-><init>(Ltf/l;Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;

    .line 7
    .line 8
    invoke-direct {v1, p0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ltf/l;Ltf/l;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->ActualizePermissions:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 12
    .line 13
    invoke-direct {p0, v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->retryLaunch(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final processIdentity(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->obtainUserID()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    .line 8
    .line 9
    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;

    .line 10
    .line 11
    invoke-direct {v2, p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1, v2}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final processInit(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;->getAppState()Lcom/qonversion/android/sdk/internal/AppState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/AppState;->isBackground()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingInitRequestData:Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->init(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final processPendingInitIfAvailable()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingInitRequestData:Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processInit(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingInitRequestData:Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private final processPurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 12
    .line 13
    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 14
    .line 15
    const/4 v5, 0x6

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p3, v1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    new-instance p3, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v0, "purchaseProduct() -> Purchase of the product "

    .line 57
    .line 58
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p2, " is already in progress. This call will be ignored"

    .line 65
    .line 66
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->release(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 78
    .line 79
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {p0, p3, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->updatePurchaseOptions(Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    invoke-interface {p3, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method private static final purchaseProduct$tryToPurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->tryToPurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final removePurchaseOptions(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->updatePurchaseOptions(Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static synthetic restore$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final retryLaunch(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            "Ltf/l;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$retryLaunch$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$retryLaunch$1;-><init>(Ltf/l;Ltf/l;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p3, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/dto/QonversionError;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isAnalyticsMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getCode()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getHttpCode$sdk_release()Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isInternalServerError(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-ne p1, v2, :cond_1

    .line 33
    .line 34
    :cond_0
    return v2

    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method private final storeFailedPurchaseIfNecessary(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp()Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/4 v0, 0x1

    .line 14
    if-ne p3, v0, :cond_0

    .line 15
    .line 16
    invoke-static {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$1;

    .line 31
    .line 32
    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;

    .line 36
    .line 37
    invoke-direct {v1, p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$storeFailedPurchaseIfNecessary$1$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p3, p1, v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->getStoreProductType(Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lef/C;->a:Lef/C;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    :goto_0
    if-nez p1, :cond_2

    .line 48
    .line 49
    invoke-static {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

.method private static final storeFailedPurchaseIfNecessary$storePurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->savePurchase(Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final tryToPurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualProducts()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 14
    .line 15
    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :cond_0
    invoke-interface {p3, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getProductId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {p0, v1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProductForPurchase(Ljava/lang/String;Ljava/util/Map;)Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    new-instance v2, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 40
    .line 41
    sget-object v3, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 42
    .line 43
    const/4 v6, 0x6

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p3, v2}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOldProduct$sdk_release()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    :cond_3
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOldProductId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {p0, v2, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProductForPurchase(Ljava/lang/String;Ljava/util/Map;)Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :cond_4
    invoke-virtual {p2, v1, v2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->enrich(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processPurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method private final updateLaunchResult(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->save(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final updatePurchaseOptions(Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 22
    .line 23
    :goto_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasesCache:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 24
    .line 25
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getProcessingPurchaseOptions()Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->saveProcessingPurchasesOptions(Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method


# virtual methods
.method public final checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->entitlementCallbacks:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {p0, p1, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final checkTrialIntroEligibilityForProductIds(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "productIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;

    .line 12
    .line 13
    invoke-direct {v0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadProducts(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final declared-synchronized getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->billingService:Lcom/qonversion/android/sdk/internal/billing/BillingService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :cond_0
    :try_start_1
    const-string v0, "billingService"

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    throw v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method

.method public final getUserInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/dto/QUser;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getUid()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->getCurrentPartnersIdentityId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QUser;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QUser;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "identityId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->getCurrentPartnersIdentityId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    if-eqz p2, :cond_4

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getUserInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->addIdentityCallback(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p2, 0x0

    .line 37
    iput-boolean p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 38
    .line 39
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    iget-boolean p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    .line 53
    .line 54
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    new-instance v5, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;

    .line 59
    .line 60
    invoke-direct {v5, p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    .line 64
    .line 65
    iget-wide v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->installDate:J

    .line 66
    .line 67
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->advertisingID:Ljava/lang/String;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    sget-object v6, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 71
    .line 72
    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 76
    .line 77
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->init(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processIdentity(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_0
    return-void
.end method

.method public isUserStable()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processingPartnersIdentityId:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public final launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "requestTrigger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getLaunchCallback(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->resetSessionCache()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->isKidsMode()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    new-instance v0, Lcom/qonversion/android/sdk/internal/AdvertisingProvider;

    .line 31
    .line 32
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->context:Landroid/app/Application;

    .line 36
    .line 37
    new-instance v2, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;

    .line 38
    .line 39
    invoke-direct {v2, p0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider;->init(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final loadProducts(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->productsCallbacks:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isLaunchingFinished()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getSessionLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadStoreProductsIfPossible()V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lef/C;->a:Lef/C;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object p1, v0

    .line 34
    :goto_0
    if-nez p1, :cond_2

    .line 35
    .line 36
    sget-object p1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Products:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    invoke-static {p0, p1, v0, v1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_1
    return-void
.end method

.method public final logout()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->pendingPartnersIdentityId:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identityManager:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->logoutIfNeeded()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->onUserUpdate()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchResultCache:Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->clearPermissionsCache()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->unhandledLogoutAvailable:Z

    .line 24
    .line 25
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->obtainUserID()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setUid(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$offerings$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$offerings$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadProducts(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onAppForeground()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingPurchases()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processPendingInitIfAvailable()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPurchasesCompleted(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "purchases"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePurchases(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onPurchasesFailed(Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/internal/billing/BillingError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "purchases"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, p2

    .line 12
    check-cast v0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/android/billingclient/api/Purchase;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 49
    .line 50
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 51
    .line 52
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v2}, Lkotlin/jvm/internal/K;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ErrorsKt;->toQonversionError(Lcom/qonversion/android/sdk/internal/billing/BillingError;)Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    return-void

    .line 74
    :cond_2
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 75
    .line 76
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    check-cast p2, Ljava/lang/Iterable;

    .line 81
    .line 82
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 97
    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ErrorsKt;->toQonversionError(Lcom/qonversion/android/sdk/internal/billing/BillingError;)Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchasingCallbacks:Ljava/util/Map;

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "purchaseModel"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isAnalyticsMode()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 25
    .line 26
    const-string v1, "Making purchases via Qonversion in the Analytics mode can lead to an inconsistent state in the store. Consider switching to the Subscription management mode."

    .line 27
    .line 28
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->warn(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launchError:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$purchaseProduct$1;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$purchaseProduct$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$purchaseProduct$2;

    .line 41
    .line 42
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$purchaseProduct$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 46
    .line 47
    invoke-direct {p0, v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->retryLaunch(Ltf/l;Ltf/l;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct$tryToPurchase(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "requestTrigger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restoreCallbacks:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-boolean p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const/4 p2, 0x1

    .line 19
    iput-boolean p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->isRestoreInProgress:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance v0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$2;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$2;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2, v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->queryPurchasesHistory(Ltf/l;Ltf/l;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final declared-synchronized setBillingService(Lcom/qonversion/android/sdk/internal/billing/BillingService;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/billing/BillingService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "<set-?>"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->billingService:Lcom/qonversion/android/sdk/internal/billing/BillingService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p1
.end method

.method public final setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "entitlementsUpdateListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final syncPurchases()V
    .locals 3

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncPurchases:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-static {p0, v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
