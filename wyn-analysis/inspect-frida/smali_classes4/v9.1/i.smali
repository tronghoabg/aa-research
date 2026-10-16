.class public final Lv9/i;
.super Lmd/y;
.source "SourceFile"


# static fields
.field public static final c:Lmd/W;

.field public static final d:Lmd/W;


# instance fields
.field public final a:Ln9/d;

.field public final b:Ln9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lmd/b0;->d:Lmd/j;

    .line 2
    .line 3
    sget-object v1, Lmd/Y;->d:Ljava/util/BitSet;

    .line 4
    .line 5
    new-instance v1, Lmd/W;

    .line 6
    .line 7
    const-string v2, "Authorization"

    .line 8
    .line 9
    invoke-direct {v1, v2, v0}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lv9/i;->c:Lmd/W;

    .line 13
    .line 14
    new-instance v1, Lmd/W;

    .line 15
    .line 16
    const-string v2, "x-firebase-appcheck"

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lv9/i;->d:Lmd/W;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ln9/d;Ln9/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv9/i;->a:Ln9/d;

    .line 5
    .line 6
    iput-object p2, p0, Lv9/i;->b:Ln9/b;

    .line 7
    .line 8
    return-void
.end method
