.class public final LHf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/d;


# instance fields
.field public final a:LHf/o;


# direct methods
.method public constructor <init>(LHf/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LHf/g;->a:LHf/o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LHf/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LHf/g;->a:LHf/o;

    .line 8
    .line 9
    invoke-virtual {p1, v0, p2}, LHf/o;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 14
    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 19
    .line 20
    return-object p1
.end method
