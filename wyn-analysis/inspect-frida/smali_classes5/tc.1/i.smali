.class public final Ltc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lmd/J;


# instance fields
.field public final a:LVa/X7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmd/J;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmd/J;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ltc/i;->b:Lmd/J;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lmc/b;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LVa/X7;

    .line 5
    .line 6
    sget-object v1, Luc/l;->a:Luc/l;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "flutter/settings"

    .line 10
    .line 11
    invoke-direct {v0, p1, v1, v2, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ltc/i;->a:LVa/X7;

    .line 15
    .line 16
    return-void
.end method
