.class public final LIf/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/m;


# instance fields
.field public final a:LGf/t;


# direct methods
.method public constructor <init>(LGf/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LIf/C;->a:LGf/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/C;->a:LGf/t;

    .line 2
    .line 3
    check-cast v0, LGf/s;

    .line 4
    .line 5
    iget-object v0, v0, LGf/s;->d:LGf/e;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, LGf/w;->i(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 17
    .line 18
    return-object p1
.end method
