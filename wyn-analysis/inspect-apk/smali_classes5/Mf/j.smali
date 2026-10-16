.class public abstract LMf/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH6/g;

.field public static final b:LH6/g;

.field public static final c:LH6/g;

.field public static final d:LH6/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LH6/g;

    .line 2
    .line 3
    const-string v1, "STATE_REG"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LMf/j;->a:LH6/g;

    .line 10
    .line 11
    new-instance v0, LH6/g;

    .line 12
    .line 13
    const-string v1, "STATE_COMPLETED"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, LMf/j;->b:LH6/g;

    .line 19
    .line 20
    new-instance v0, LH6/g;

    .line 21
    .line 22
    const-string v1, "STATE_CANCELLED"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LMf/j;->c:LH6/g;

    .line 28
    .line 29
    new-instance v0, LH6/g;

    .line 30
    .line 31
    const-string v1, "NO_RESULT"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, LMf/j;->d:LH6/g;

    .line 37
    .line 38
    new-instance v0, LH6/g;

    .line 39
    .line 40
    const-string v1, "PARAM_CLAUSE_0"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
