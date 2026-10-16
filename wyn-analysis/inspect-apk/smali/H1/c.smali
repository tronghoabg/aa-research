.class public final LH1/c;
.super LH1/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LH1/a;->b:LH1/a;

    invoke-direct {p0, v0}, LH1/c;-><init>(LH1/b;)V

    return-void
.end method

.method public constructor <init>(LH1/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, LH1/b;-><init>()V

    .line 3
    iget-object v0, p0, LH1/b;->a:Ljava/util/LinkedHashMap;

    iget-object p1, p1, LH1/b;->a:Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
