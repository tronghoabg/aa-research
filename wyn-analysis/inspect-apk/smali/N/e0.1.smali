.class public final LN/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/V;
.implements LEf/E;


# instance fields
.field public final a:Ljf/h;

.field public final synthetic b:LN/V;


# direct methods
.method public constructor <init>(LN/V;Ljf/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LN/e0;->a:Ljf/h;

    .line 5
    .line 6
    iput-object p1, p0, LN/e0;->b:LN/V;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Ljf/h;
    .locals 1

    .line 1
    iget-object v0, p0, LN/e0;->a:Ljf/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LN/e0;->b:LN/V;

    .line 2
    .line 3
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/e0;->b:LN/V;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
