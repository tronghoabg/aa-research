.class public final LN/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/q0;


# instance fields
.field public final a:Ltf/l;

.field public b:LN/B;


# direct methods
.method public constructor <init>(Ltf/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/A;->a:Ltf/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    .line 1
    sget-object v0, LN/d;->h:LN/C;

    .line 2
    .line 3
    iget-object v1, p0, LN/A;->a:Ltf/l;

    .line 4
    .line 5
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LN/B;

    .line 10
    .line 11
    iput-object v0, p0, LN/A;->b:LN/B;

    .line 12
    .line 13
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    iget-object v0, p0, LN/A;->b:LN/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LN/B;->dispose()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, LN/A;->b:LN/B;

    .line 10
    .line 11
    return-void
.end method
