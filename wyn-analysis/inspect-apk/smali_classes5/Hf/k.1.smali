.class public final LHf/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/l;


# instance fields
.field public final a:LHf/l;


# direct methods
.method public constructor <init>(LHf/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LHf/k;->a:LHf/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lkotlin/jvm/internal/G;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LIf/c;->b:LH6/g;

    .line 7
    .line 8
    iput-object v1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, LHf/j;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v0, p1, v2}, LHf/j;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LHf/k;->a:LHf/l;

    .line 17
    .line 18
    invoke-interface {p1, v1, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 23
    .line 24
    if-ne p1, p2, :cond_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 28
    .line 29
    return-object p1
.end method
