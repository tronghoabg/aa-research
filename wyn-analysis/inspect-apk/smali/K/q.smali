.class public abstract LK/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/L0;

.field public static final b:LN/D;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, LK/f;->n:LK/f;

    .line 2
    .line 3
    new-instance v1, LN/L0;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LN/f0;-><init>(Ltf/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, LK/q;->a:LN/L0;

    .line 9
    .line 10
    sget-object v0, LK/f;->m:LK/f;

    .line 11
    .line 12
    sget-object v1, LN/P;->f:LN/P;

    .line 13
    .line 14
    new-instance v2, LN/D;

    .line 15
    .line 16
    invoke-direct {v2, v1, v0}, LN/D;-><init>(LN/A0;Ltf/a;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, LK/q;->b:LN/D;

    .line 20
    .line 21
    return-void
.end method
