.class public abstract Lm9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm9/u;

.field public static final b:Lm9/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm9/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm9/x;->a:Lm9/u;

    .line 7
    .line 8
    new-instance v0, Lm9/w;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lm9/x;->b:Lm9/w;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method
