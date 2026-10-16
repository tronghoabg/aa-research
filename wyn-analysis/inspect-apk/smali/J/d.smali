.class public abstract LJ/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/D;

.field public static final b:LJ/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, LJ/a;->k:LJ/a;

    .line 2
    .line 3
    sget-object v1, LN/P;->f:LN/P;

    .line 4
    .line 5
    new-instance v2, LN/D;

    .line 6
    .line 7
    invoke-direct {v2, v1, v0}, LN/D;-><init>(LN/A0;Ltf/a;)V

    .line 8
    .line 9
    .line 10
    sput-object v2, LJ/d;->a:LN/D;

    .line 11
    .line 12
    const-wide v0, 0xff4286f4L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Le0/z;->c(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    new-instance v2, LJ/c;

    .line 22
    .line 23
    const v3, 0x3ecccccd    # 0.4f

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v3}, Le0/q;->a(JF)J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-direct {v2, v0, v1, v3, v4}, LJ/c;-><init>(JJ)V

    .line 31
    .line 32
    .line 33
    sput-object v2, LJ/d;->b:LJ/c;

    .line 34
    .line 35
    return-void
.end method
