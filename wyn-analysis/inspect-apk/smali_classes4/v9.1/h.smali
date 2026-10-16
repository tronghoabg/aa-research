.class public final Lv9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lmd/W;

.field public static final e:Lmd/W;

.field public static final f:Lmd/W;


# instance fields
.field public final a:LO9/b;

.field public final b:LO9/b;

.field public final c:Ls8/l;


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
    const-string v2, "x-firebase-client-log-type"

    .line 8
    .line 9
    invoke-direct {v1, v2, v0}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lv9/h;->d:Lmd/W;

    .line 13
    .line 14
    new-instance v1, Lmd/W;

    .line 15
    .line 16
    const-string v2, "x-firebase-client"

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lv9/h;->e:Lmd/W;

    .line 22
    .line 23
    new-instance v1, Lmd/W;

    .line 24
    .line 25
    const-string v2, "x-firebase-gmpid"

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lv9/h;->f:Lmd/W;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(LO9/b;LO9/b;Ls8/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv9/h;->b:LO9/b;

    .line 5
    .line 6
    iput-object p2, p0, Lv9/h;->a:LO9/b;

    .line 7
    .line 8
    iput-object p3, p0, Lv9/h;->c:Ls8/l;

    .line 9
    .line 10
    return-void
.end method
