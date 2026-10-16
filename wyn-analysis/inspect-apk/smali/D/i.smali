.class public final LD/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LHf/j0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LGf/a;->a:LGf/a;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {v0, v1, v2}, LHf/k0;->b(III)LHf/j0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LD/i;->a:LHf/j0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(LD/h;Llf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LD/i;->a:LHf/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LHf/j0;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 13
    .line 14
    return-object p1
.end method
