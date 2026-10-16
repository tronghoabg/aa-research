.class public final LM3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:I

.field public final c:Lb7/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "ConstraintsCmdHandler"

    .line 2
    .line 3
    invoke-static {v0}, LJ3/r;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LM3/e;->d:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILM3/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM3/e;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput p2, p0, LM3/e;->b:I

    .line 7
    .line 8
    iget-object p1, p3, LM3/j;->e:LK3/q;

    .line 9
    .line 10
    iget-object p1, p1, LK3/q;->j:LS3/n;

    .line 11
    .line 12
    new-instance p2, Lb7/k;

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-direct {p2, p1, p3}, Lb7/k;-><init>(LS3/n;LO3/b;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, LM3/e;->c:Lb7/k;

    .line 19
    .line 20
    return-void
.end method
