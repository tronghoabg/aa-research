.class public final Lr9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lq6/d;

.field public static final d:Lq6/d;


# instance fields
.field public final a:Ls9/h;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq6/d;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq6/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr9/c;->c:Lq6/d;

    .line 9
    .line 10
    new-instance v0, Lq6/d;

    .line 11
    .line 12
    const/16 v1, 0xb

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lq6/d;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lr9/c;->d:Lq6/d;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Ls9/h;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/c;->a:Ls9/h;

    .line 5
    .line 6
    iput p2, p0, Lr9/c;->b:I

    .line 7
    .line 8
    return-void
.end method
