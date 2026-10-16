.class public final Ltc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LVa/X7;


# direct methods
.method public constructor <init>(Lmc/b;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LVa/X7;

    sget-object v1, Luc/l;->a:Luc/l;

    const/4 v2, 0x0

    .line 3
    const-string v3, "flutter/system"

    invoke-direct {v0, p1, v1, v2, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iput-object v0, p0, Ltc/a;->a:LVa/X7;

    return-void
.end method

.method public constructor <init>(Luc/f;)V
    .locals 4

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LVa/X7;

    sget-object v1, Luc/l;->a:Luc/l;

    const/4 v2, 0x0

    .line 7
    const-string v3, "flutter/keyevent"

    invoke-direct {v0, p1, v1, v2, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iput-object v0, p0, Ltc/a;->a:LVa/X7;

    return-void
.end method
