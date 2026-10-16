.class public final synthetic LY3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/m;
.implements Lkotlin/jvm/internal/f;


# instance fields
.field public final synthetic a:LY3/n;


# direct methods
.method public constructor <init>(LY3/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY3/i;->a:LY3/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY3/g;

    .line 2
    .line 3
    iget-object p2, p0, LY3/i;->a:LY3/n;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, LY3/n;->i(LY3/g;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lef/C;->a:Lef/C;

    .line 9
    .line 10
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 11
    .line 12
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LHf/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    instance-of v0, p1, Lkotlin/jvm/internal/f;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, LY3/i;->getFunctionDelegate()Lef/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast p1, Lkotlin/jvm/internal/f;

    .line 15
    .line 16
    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Lef/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Lef/e;
    .locals 7

    .line 1
    new-instance v0, Lkotlin/jvm/internal/a;

    .line 2
    .line 3
    const-string v5, "updateState(Lcoil/compose/AsyncImagePainter$State;)V"

    .line 4
    .line 5
    const/4 v6, 0x4

    .line 6
    const/4 v1, 0x2

    .line 7
    iget-object v2, p0, LY3/i;->a:LY3/n;

    .line 8
    .line 9
    const-class v3, LY3/n;

    .line 10
    .line 11
    const-string v4, "updateState"

    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LY3/i;->getFunctionDelegate()Lef/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
